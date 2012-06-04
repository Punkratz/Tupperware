package com.vcp.tupperware.provider.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.vcp.tupperware.user.model.UserModel;


@ManagedBean
@SessionScoped
public class ModelProvider
{
	private UserModel model = new UserModel();

	public UserModel getModel()
	{
		return model;
	}
}
