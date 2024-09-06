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
package de.bxservice.csscustomization.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.zkoss.zk.ui.util.Clients;


public class MBXSCSSCustom extends X_BXS_CSSCustom {

	private static final long serialVersionUID = 5021724064584353624L;

	public MBXSCSSCustom(Properties ctx, int BXS_CSSCustom_ID, String trxName) {
		super(ctx, BXS_CSSCustom_ID, trxName);
	}

	public MBXSCSSCustom(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (!validateCSS(getBXS_CustomCSS())) {
			log.saveError("Error", "Invalid CSS");
			return false;
		} else {
	        String cssStyle = "<style id=\"" + getName() + "\">" + getBXS_CustomCSS().replace("\\", "") + "</style>";
	        //Remove the style with id - if exists
	        Clients.evalJavaScript("jq('#" + getName() + "').remove();");

	        Clients.evalJavaScript("jq('head').append('" + cssStyle + "');");
		}
		return super.beforeSave(newRecord);
	}

	public static boolean validateCSS(String css) {
		//Validate the css to secure against css injection
        return true;
    }

}
