package com.vcp.tupperware.presentation.model;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import com.vcp.tupperware.user.model.UserModel;
import com.vcp.tupperware.user.model.beans.User;


@ManagedBean
@SessionScoped
public class PresentationModel implements Serializable
{
	protected final Logger logger = Logger.getLogger(getClass().getSimpleName());
	@ManagedProperty(value = "#{user}")
	protected User user;
	protected UserModel userModel;
	private String masterTempalte = "master-template.xhtml";
	private String subTitle = ":Test";

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
		setUserModel(user.getModel());
	}

	public UserModel getUserModel()
	{
		return userModel;
	}

	public void setUserModel(UserModel userModel)
	{
		this.userModel = userModel;
	}

	public String getMasterTempalte()
	{
		return masterTempalte;
	}

	public String getSubTitle()
	{
		return subTitle;
	}

	public void setSubTitle(String subTitle)
	{
		this.subTitle = subTitle;
	}
}
