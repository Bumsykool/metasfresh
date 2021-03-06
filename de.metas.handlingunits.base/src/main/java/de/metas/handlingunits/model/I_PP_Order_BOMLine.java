package de.metas.handlingunits.model;

/*
 * #%L
 * de.metas.handlingunits.base
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


public interface I_PP_Order_BOMLine extends org.eevolution.model.I_PP_Order_BOMLine
{
	// @formatter:off
	public static final String COLUMNNAME_M_HU_LUTU_Configuration_ID = "M_HU_LUTU_Configuration_ID";
	//public void setM_HU_LUTU_Configuration_ID(int M_HU_LUTU_Configuration_ID);
	public void setM_HU_LUTU_Configuration(I_M_HU_LUTU_Configuration M_HU_LUTU_Configuration);
	//public int getM_HU_LUTU_Configuration_ID();
	public I_M_HU_LUTU_Configuration getM_HU_LUTU_Configuration();
	// @formatter:on
}
