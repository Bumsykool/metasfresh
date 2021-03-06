package org.adempiere.acct.api;

import org.compiere.model.I_Fact_Acct;

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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/**
 * Listens {@link I_Fact_Acct} events.
 * 
 * @author metas-dev <dev@metasfresh.com>
 *
 */
public interface IFactAcctListener
{
	/**
	 * Called when a document is about to be posted, right before saving the {@link I_Fact_Acct} records.
	 * 
	 * @param document
	 */
	void onBeforePost(final Object document);

	/**
	 * Called when a document is about to be posted, right after saving the {@link I_Fact_Acct} records.
	 * 
	 * @param document
	 */
	void onAfterPost(final Object document);

	/**
	 * Called after document's {@link I_Fact_Acct} records were deleted.
	 * 
	 * @param document
	 */
	void onAfterUnpost(final Object document);
}
