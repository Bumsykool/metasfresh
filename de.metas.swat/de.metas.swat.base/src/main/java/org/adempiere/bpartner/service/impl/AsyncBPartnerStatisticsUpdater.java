package org.adempiere.bpartner.service.impl;

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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

import java.util.Properties;
import java.util.Set;

import org.adempiere.bpartner.service.async.spi.impl.C_BPartner_UpdateStatsFromBPartner;

import de.metas.bpartner.IBPartnerStatisticsUpdater;

public class AsyncBPartnerStatisticsUpdater implements IBPartnerStatisticsUpdater
{

	@Override
	public void updateBPartnerStatistics(final Properties ctx, final Set<Integer> bpartnerIds, final String trxName)
	{
		C_BPartner_UpdateStatsFromBPartner.createWorkpackage(ctx, bpartnerIds, trxName);
	}
}
