/**
 * 
 */
package de.metas.location.impl;

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


import java.util.List;
import java.util.Properties;

import org.adempiere.ad.dao.IQueryFilter;
import org.adempiere.ad.wrapper.POJOLookupMap;
import org.compiere.model.I_C_Country;
import org.junit.Ignore;

import de.metas.location.ICountryCustomInfo;
import de.metas.location.impl.CountryDAO;

/**
 * @author cg
 * 
 */

@Ignore
public class PlainCountryDAO extends CountryDAO
{
	private final POJOLookupMap lookupMap = POJOLookupMap.get();

	public POJOLookupMap getLookupMap()
	{
		return lookupMap;
	}

	@Override
	public ICountryCustomInfo retriveCountryCustomInfo(Properties ctx, String trxName)
	{
		return null;
	}

	@Override
	public I_C_Country getDefault(Properties ctx)
	{
		return lookupMap.getFirstOnly(I_C_Country.class, new IQueryFilter<I_C_Country>()
		{
			@Override
			public boolean accept(final I_C_Country pojo)
			{
				return true;
			}
		});
	}

	@Override
	public I_C_Country get(final Properties ctx, final int C_Country_ID)
	{
		return lookupMap.getFirstOnly(I_C_Country.class, new IQueryFilter<I_C_Country>()
		{
			@Override
			public boolean accept(final I_C_Country pojo)
			{
				return pojo.getC_Country_ID() == C_Country_ID;
			}
		});
	}

	@Override
	public List<I_C_Country> getCountries(Properties ctx)
	{
		return lookupMap.getRecords(I_C_Country.class, new IQueryFilter<I_C_Country>()
		{

			@Override
			public boolean accept(final I_C_Country pojo)
			{
				return true;
			}
		});
	}
}
