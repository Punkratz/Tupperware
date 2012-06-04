package com.vcp.tupperware.user.model;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import com.vcp.tupperware.provider.model.ModelProvider;


public class CustomerConverter implements Converter
{
	private UserModel userModel = new ModelProvider().getModel();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value)
	{
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value)
	{
		return null;
	}
}
