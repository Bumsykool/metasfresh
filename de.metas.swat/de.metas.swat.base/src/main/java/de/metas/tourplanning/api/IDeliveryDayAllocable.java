package de.metas.tourplanning.api;

/*
 * #%L
 * de.metas.swat.base
 * %%
 * Copyright (C) 2015 metas GmbH
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


import java.sql.Timestamp;

import de.metas.tourplanning.model.I_M_DeliveryDay;

/**
 * A document line which is allocable to a {@link I_M_DeliveryDay}.
 * 
 * Implementations of this interface will handle specific cases (e.g. shipment schedules, receipt schedules etc).
 * 
 * @author tsa
 *
 */
public interface IDeliveryDayAllocable
{
	String getTableName();

	int getRecord_ID();

	int getAD_Org_ID();

	Timestamp getDeliveryDate();

	int getC_BPartner_Location_ID();

	int getM_Product_ID();

	/**
	 * 
	 * @return <ul>
	 *         <li>true if materials needs to be fetched from vendor (i.e. document has IsSOTrx=false)
	 *         <li>false if materials needs to be delivered to customer (i.e. document has IsSOTrx=true)
	 *         </ul>
	 */
	boolean isToBeFetched();
}
