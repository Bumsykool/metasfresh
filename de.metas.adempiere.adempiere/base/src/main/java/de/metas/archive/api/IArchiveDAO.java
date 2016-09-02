package de.metas.archive.api;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
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

import org.adempiere.util.ISingletonService;
import org.compiere.model.I_AD_Archive;

/**
 * Archive related DAO
 *
 * @author tsa
 *
 */
public interface IArchiveDAO extends ISingletonService
{
	/**
	 * Retrieves all archive records for context's AD_Client_ID by using given whereClause. Records will be ordered by Created.
	 *
	 * @param ctx context
	 * @param whereClause optional where clause (starting with AND)
	 * @return list of {@link I_AD_Archive}s
	 */
	List<I_AD_Archive> retrieveArchives(Properties ctx, String whereClause);

	/**
	 * Retrieves underlying model, referenced by AD_Table_ID and Record_ID
	 *
	 * @param archive
	 * @param modelClass
	 * @return underlying model or null
	 */
	<T> T retrieveReferencedModel(I_AD_Archive archive, Class<T> modelClass);

	/**
	 * @param model
	 * @param archiveClass
	 * @return PDF archive for model or null
	 */
	<T extends I_AD_Archive> T retrievePDFArchiveForModel(Object model, Class<T> archiveClass);
}
