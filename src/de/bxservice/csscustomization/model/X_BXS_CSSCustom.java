/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
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
package de.bxservice.csscustomization.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_Persistent;
import org.compiere.model.PO;
import org.compiere.model.POInfo;

/** Generated Model for BXS_CSSCustom
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="BXS_CSSCustom")
public class X_BXS_CSSCustom extends PO implements I_BXS_CSSCustom, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240906L;

    /** Standard Constructor */
    public X_BXS_CSSCustom (Properties ctx, int BXS_CSSCustom_ID, String trxName)
    {
      super (ctx, BXS_CSSCustom_ID, trxName);
      /** if (BXS_CSSCustom_ID == 0)
        {
			setBXS_CSSCustom_ID (0);
			setBXS_CustomCSS (null);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_BXS_CSSCustom (Properties ctx, int BXS_CSSCustom_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, BXS_CSSCustom_ID, trxName, virtualColumns);
      /** if (BXS_CSSCustom_ID == 0)
        {
			setBXS_CSSCustom_ID (0);
			setBXS_CustomCSS (null);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_BXS_CSSCustom (Properties ctx, String BXS_CSSCustom_UU, String trxName)
    {
      super (ctx, BXS_CSSCustom_UU, trxName);
      /** if (BXS_CSSCustom_UU == null)
        {
			setBXS_CSSCustom_ID (0);
			setBXS_CustomCSS (null);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_BXS_CSSCustom (Properties ctx, String BXS_CSSCustom_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, BXS_CSSCustom_UU, trxName, virtualColumns);
      /** if (BXS_CSSCustom_UU == null)
        {
			setBXS_CSSCustom_ID (0);
			setBXS_CustomCSS (null);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_BXS_CSSCustom (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_BXS_CSSCustom[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Custom CSS.
		@param BXS_CSSCustom_ID Custom CSS
	*/
	public void setBXS_CSSCustom_ID (int BXS_CSSCustom_ID)
	{
		if (BXS_CSSCustom_ID < 1)
			set_ValueNoCheck (COLUMNNAME_BXS_CSSCustom_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_BXS_CSSCustom_ID, Integer.valueOf(BXS_CSSCustom_ID));
	}

	/** Get Custom CSS.
		@return Custom CSS	  */
	public int getBXS_CSSCustom_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BXS_CSSCustom_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set BXS_CSSCustom_UU.
		@param BXS_CSSCustom_UU BXS_CSSCustom_UU
	*/
	public void setBXS_CSSCustom_UU (String BXS_CSSCustom_UU)
	{
		set_Value (COLUMNNAME_BXS_CSSCustom_UU, BXS_CSSCustom_UU);
	}

	/** Get BXS_CSSCustom_UU.
		@return BXS_CSSCustom_UU	  */
	public String getBXS_CSSCustom_UU()
	{
		return (String)get_Value(COLUMNNAME_BXS_CSSCustom_UU);
	}

	/** Set Custom CSS.
		@param BXS_CustomCSS Custom CSS
	*/
	public void setBXS_CustomCSS (String BXS_CustomCSS)
	{
		set_Value (COLUMNNAME_BXS_CustomCSS, BXS_CustomCSS);
	}

	/** Get Custom CSS.
		@return Custom CSS	  */
	public String getBXS_CustomCSS()
	{
		return (String)get_Value(COLUMNNAME_BXS_CustomCSS);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}
}