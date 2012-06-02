package com.vcp.tupperware.user.buisness.authorization;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import com.vcp.tupperware.user.model.beans.User;


@ManagedBean
@Stateless
public class Authorizator implements Serializable
{
	private final Logger logger = Logger.getLogger(getClass().getSimpleName());
	@ManagedProperty(value = "#{user}")
	private User user;

	public String login()
	{
		logger.log(Level.INFO, "User loggen in: '" + user + "'");
		user.setLoggedIn(true);
		return "index";
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
}
