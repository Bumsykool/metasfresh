package de.metas.procurement.base.order;

import java.util.Date;

import org.adempiere.ad.dao.IQueryBuilder;
import org.adempiere.util.ISingletonService;
import org.compiere.model.I_C_Order;

import de.metas.procurement.base.model.I_PMM_PurchaseCandidate;
import de.metas.procurement.base.model.I_PMM_PurchaseCandidate_OrderLine;

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

public interface IPMMPurchaseCandidateDAO extends ISingletonService
{
	IQueryBuilder<I_PMM_PurchaseCandidate_OrderLine> retrivePurchaseCandidateOrderLines(I_C_Order order);

	void deletePurchaseCandidateOrderLines(I_C_Order order);

	I_PMM_PurchaseCandidate retrieveFor(int bpartnerId, int productId, Date day);
}
