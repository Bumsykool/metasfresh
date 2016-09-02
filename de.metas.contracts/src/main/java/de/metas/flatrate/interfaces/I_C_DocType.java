package de.metas.flatrate.interfaces;

/*
 * #%L
 * de.metas.contracts
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


import de.metas.flatrate.model.X_C_Flatrate_Term;

public interface I_C_DocType extends de.metas.document.model.I_C_DocType
{

	/**
	 * @see X_C_Flatrate_Term#TYPE_CONDITIONS_Pauschalengebuehr
	 */
	public static final String DocSubType_Pauschalengebuehr = "FF";
	/**
	 * @see X_C_Flatrate_Term#TYPE_CONDITIONS_Depotgebuehr
	 */
	public static final String DocSubType_Depotgebuehr = "HF";
	/**
	 * @see X_C_Flatrate_Term#TYPE_CONDITIONS_Abonnement
	 */
	public static final String DocSubType_Abonnement = "SU";
	
	
	public static final String DocBaseType_CustomerContract = "CON";

}
