/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package de.metas.async.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for C_Queue_Processor
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_C_Queue_Processor extends org.compiere.model.PO implements I_C_Queue_Processor, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = -1661696074L;

    /** Standard Constructor */
    public X_C_Queue_Processor (Properties ctx, int C_Queue_Processor_ID, String trxName)
    {
      super (ctx, C_Queue_Processor_ID, trxName);
      /** if (C_Queue_Processor_ID == 0)
        {
			setC_Queue_Processor_ID (0);
			setKeepAliveTimeMillis (0);
// 0
			setName (null);
			setPoolSize (0);
// 10
        } */
    }

    /** Load Constructor */
    public X_C_Queue_Processor (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

	/** Set Queue Processor Definition.
		@param C_Queue_Processor_ID Queue Processor Definition	  */
	@Override
	public void setC_Queue_Processor_ID (int C_Queue_Processor_ID)
	{
		if (C_Queue_Processor_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Queue_Processor_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Queue_Processor_ID, Integer.valueOf(C_Queue_Processor_ID));
	}

	/** Get Queue Processor Definition.
		@return Queue Processor Definition	  */
	@Override
	public int getC_Queue_Processor_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Queue_Processor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Keep Alive Time (millis).
		@param KeepAliveTimeMillis 
		When the number of threads is greater than the core, this is the maximum time that excess idle threads will wait for new tasks before terminating.
	  */
	@Override
	public void setKeepAliveTimeMillis (int KeepAliveTimeMillis)
	{
		set_Value (COLUMNNAME_KeepAliveTimeMillis, Integer.valueOf(KeepAliveTimeMillis));
	}

	/** Get Keep Alive Time (millis).
		@return When the number of threads is greater than the core, this is the maximum time that excess idle threads will wait for new tasks before terminating.
	  */
	@Override
	public int getKeepAliveTimeMillis () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KeepAliveTimeMillis);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	@Override
	public void setName (java.lang.String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	@Override
	public java.lang.String getName () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Name);
	}

	/** Set Pool Size.
		@param PoolSize 
		The number of threads to keep in the pool, even if they are idle
	  */
	@Override
	public void setPoolSize (int PoolSize)
	{
		set_Value (COLUMNNAME_PoolSize, Integer.valueOf(PoolSize));
	}

	/** Get Pool Size.
		@return The number of threads to keep in the pool, even if they are idle
	  */
	@Override
	public int getPoolSize () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PoolSize);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** 
	 * Priority AD_Reference_ID=154
	 * Reference name: _PriorityRule
	 */
	public static final int PRIORITY_AD_Reference_ID=154;
	/** High = 3 */
	public static final String PRIORITY_High = "3";
	/** Medium = 5 */
	public static final String PRIORITY_Medium = "5";
	/** Low = 7 */
	public static final String PRIORITY_Low = "7";
	/** Urgent = 1 */
	public static final String PRIORITY_Urgent = "1";
	/** Minor = 9 */
	public static final String PRIORITY_Minor = "9";
	/** Set Priority.
		@param Priority 
		Indicates if this request is of a high, medium or low priority.
	  */
	@Override
	public void setPriority (java.lang.String Priority)
	{

		set_Value (COLUMNNAME_Priority, Priority);
	}

	/** Get Priority.
		@return Indicates if this request is of a high, medium or low priority.
	  */
	@Override
	public java.lang.String getPriority () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Priority);
	}
}