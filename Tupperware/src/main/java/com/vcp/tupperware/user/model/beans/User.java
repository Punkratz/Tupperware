package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.vcp.tupperware.provider.model.ModelProvider;
import com.vcp.tupperware.user.model.UserModel;


@ManagedBean
@SessionScoped
public class User implements Serializable
{
	private String name;
	private String password;
	private UserModel model = new ModelProvider().getModel();
	private boolean loggedIn;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public UserModel getModel()
	{
		return model;
	}

	public void setModel(UserModel model)
	{
		this.model = model;
	}

	public void setLoggedIn(boolean loggedIn)
	{
		this.loggedIn = loggedIn;
	}

	public boolean isLoggedIn()
	{
		return loggedIn;
	}

	public void logOut()
	{
		setLoggedIn(false);
	}

	@Override
	public String toString()
	{
		return name;
	}
}
