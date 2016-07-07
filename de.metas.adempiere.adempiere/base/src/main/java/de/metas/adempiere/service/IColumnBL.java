package de.metas.adempiere.service;

import java.util.Properties;

import org.adempiere.util.ISingletonService;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public interface IColumnBL extends ISingletonService
{

	/**
	 * Get the context AD Table ID for the table that is in pair with the Record_ID column.
	 * Note that both table and record column names must have the same prefix.
	 * Example: PREFIX_Record_ID and PREFIX_AD_Table_ID or PREFIX_Table_ID
	 * 
	 * @param m_ctx
	 * @param m_curWindowNo
	 * @param columnName
	 * @return the context as ID if found, 0 otherwise
	 */
	int getContextADTableID(Properties m_ctx, int m_curWindowNo, String columnName);

	/**
	 * Verify if the given columnName is "Record_ID" or has the form "Prefix_Record_ID"
	 * 
	 * @param columnName
	 * @return true if record_ID form, false otherwise
	 */
	boolean isRecordColumnName(String columnName);

}
