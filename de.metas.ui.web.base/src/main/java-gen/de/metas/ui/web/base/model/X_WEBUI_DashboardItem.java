/** Generated Model - DO NOT CHANGE */
package de.metas.ui.web.base.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for WEBUI_DashboardItem
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_WEBUI_DashboardItem extends org.compiere.model.PO implements I_WEBUI_DashboardItem, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 827887718L;

    /** Standard Constructor */
    public X_WEBUI_DashboardItem (Properties ctx, int WEBUI_DashboardItem_ID, String trxName)
    {
      super (ctx, WEBUI_DashboardItem_ID, trxName);
      /** if (WEBUI_DashboardItem_ID == 0)
        {
			setName (null);
			setWEBUI_Dashboard_ID (0);
			setWEBUI_DashboardItem_ID (0);
			setX (0);
			setY (0);
        } */
    }

    /** Load Constructor */
    public X_WEBUI_DashboardItem (Properties ctx, ResultSet rs, String trxName)
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

	/** Set URL.
		@param URL 
		Full URL address - e.g. http://www.adempiere.org
	  */
	@Override
	public void setURL (java.lang.String URL)
	{
		set_Value (COLUMNNAME_URL, URL);
	}

	/** Get URL.
		@return Full URL address - e.g. http://www.adempiere.org
	  */
	@Override
	public java.lang.String getURL () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_URL);
	}

	@Override
	public de.metas.ui.web.base.model.I_WEBUI_Dashboard getWEBUI_Dashboard() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_WEBUI_Dashboard_ID, de.metas.ui.web.base.model.I_WEBUI_Dashboard.class);
	}

	@Override
	public void setWEBUI_Dashboard(de.metas.ui.web.base.model.I_WEBUI_Dashboard WEBUI_Dashboard)
	{
		set_ValueFromPO(COLUMNNAME_WEBUI_Dashboard_ID, de.metas.ui.web.base.model.I_WEBUI_Dashboard.class, WEBUI_Dashboard);
	}

	/** Set Dashboard.
		@param WEBUI_Dashboard_ID Dashboard	  */
	@Override
	public void setWEBUI_Dashboard_ID (int WEBUI_Dashboard_ID)
	{
		if (WEBUI_Dashboard_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_WEBUI_Dashboard_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_WEBUI_Dashboard_ID, Integer.valueOf(WEBUI_Dashboard_ID));
	}

	/** Get Dashboard.
		@return Dashboard	  */
	@Override
	public int getWEBUI_Dashboard_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_WEBUI_Dashboard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Dashboard item.
		@param WEBUI_DashboardItem_ID Dashboard item	  */
	@Override
	public void setWEBUI_DashboardItem_ID (int WEBUI_DashboardItem_ID)
	{
		if (WEBUI_DashboardItem_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_WEBUI_DashboardItem_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_WEBUI_DashboardItem_ID, Integer.valueOf(WEBUI_DashboardItem_ID));
	}

	/** Get Dashboard item.
		@return Dashboard item	  */
	@Override
	public int getWEBUI_DashboardItem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_WEBUI_DashboardItem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gang (X).
		@param X 
		X-Dimension, z.B. Gang
	  */
	@Override
	public void setX (int X)
	{
		set_Value (COLUMNNAME_X, Integer.valueOf(X));
	}

	/** Get Gang (X).
		@return X-Dimension, z.B. Gang
	  */
	@Override
	public int getX () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_X);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Fach (Y).
		@param Y 
		Y-Dimension, z.B. Fach
	  */
	@Override
	public void setY (int Y)
	{
		set_Value (COLUMNNAME_Y, Integer.valueOf(Y));
	}

	/** Get Fach (Y).
		@return Y-Dimension, z.B. Fach
	  */
	@Override
	public int getY () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Y);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}