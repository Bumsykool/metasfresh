package de.metas.procurement.base.order.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.InterfaceWrapperHelper;
import org.adempiere.util.Check;
import org.adempiere.util.Services;
import org.compiere.model.I_C_Order;
import org.compiere.model.I_C_UOM;
import org.compiere.model.I_M_Product;

import de.metas.adempiere.service.IOrderLineBL;
import de.metas.handlingunits.model.I_C_OrderLine;

/*
 * #%L
 * de.metas.procurement.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public class OrderLineAggregation
{
	// services
	private final transient IOrderLineBL orderLineBL = Services.get(IOrderLineBL.class);

	private final I_C_Order order;
	private I_C_OrderLine orderLine;

	private final List<PurchaseCandidate> purchaseCandidates = new ArrayList<>();

	public OrderLineAggregation(final I_C_Order order)
	{
		super();
		Check.assumeNotNull(order, "order not null");
		this.order = order;
	}

	public I_C_OrderLine build()
	{
		if (orderLine == null)
		{
			return null;
		}

		// Save the order line
		InterfaceWrapperHelper.save(orderLine);

		// Create allocations
		for (final PurchaseCandidate candidate : purchaseCandidates)
		{
			candidate.createAllocation(orderLine);
		}

		final I_C_OrderLine orderLine = this.orderLine;
		this.orderLine = null;
		return orderLine;
	}

	public void add(final PurchaseCandidate candidate)
	{
		final BigDecimal qty = candidate.getQtyToOrder();
		if (qty.signum() == 0)
		{
			return;
		}

		if (orderLine == null)
		{
			orderLine = createOrderLine(candidate);
		}

		orderLine.setQtyEntered(orderLine.getQtyEntered().add(qty));
		// NOTE: we are not touching QtyOrdered. We expect to be automatically maintained.

		purchaseCandidates.add(candidate);
	}

	private I_C_OrderLine createOrderLine(final PurchaseCandidate candidate)
	{
		final I_M_Product product = candidate.getM_Product();
		final I_C_UOM uom = candidate.getC_UOM();
		final int huPIItemProductId = candidate.getM_HU_PI_Item_Product_ID();
		final Timestamp datePromised = candidate.getDatePromised();
		final BigDecimal price = candidate.getPrice();

		final I_C_OrderLine orderLine = orderLineBL.createOrderLine(order, I_C_OrderLine.class);

		orderLine.setM_Product(product);
		orderLine.setC_UOM(uom);
		orderLine.setM_HU_PI_Item_Product_ID(huPIItemProductId);

		orderLine.setQtyEntered(BigDecimal.ZERO);
		orderLine.setQtyOrdered(BigDecimal.ZERO);

		orderLine.setDatePromised(datePromised);
		
		orderLine.setPriceEntered(price);
		orderLine.setPriceActual(price);

		orderLine.setC_BPartner(order.getC_BPartner());
		orderLine.setC_BPartner_Location(order.getC_BPartner_Location());
		orderLine.setAD_User_ID(order.getAD_User_ID());

		return orderLine;
	}
}