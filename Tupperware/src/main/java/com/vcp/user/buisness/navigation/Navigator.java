package com.vcp.user.buisness.navigation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;


@ManagedBean
@Stateless
public class Navigator implements Serializable
{
	private final Map<String, String> navigations = new HashMap<String, String>();
	private String masterTempalte = "//master-template.xhtml";

	public Navigator()
	{
		navigations.put("welcome", "//welcome.xhtml");
		navigations.put("orders", "/order/orders.xhtml");
		navigations.put("products", "/product/products.xhtml");
		navigations.put("customers", "/customer/customers.xhtml");
		navigations.put("addCustomer", "/customer/customers.xhtml");
		navigations.put("editCustomer", "/customer/customers.xhtml");
	}

	public String getMasterTempalte()
	{
		return masterTempalte;
	}

	public Map<String, String> getNavigations()
	{
		return navigations;
	}
}
