package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.vcp.tupperware.provider.model.ModelProvider;
import com.vcp.tupperware.user.model.UserModel;


/**
 * Entity implementation class for Entity: Userr
 * 
 */
@Entity
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToOne
	private UserModel model = new ModelProvider().getModel();
	private boolean loggedIn;

	public User()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public UserModel getModel()
	{
		return model;
	}

	public void setModel(UserModel model)
	{
		this.model = model;
	}

	public boolean isLoggedIn()
	{
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn)
	{
		this.loggedIn = loggedIn;
	}

	public long getId()
	{
		return id;
	}
}
