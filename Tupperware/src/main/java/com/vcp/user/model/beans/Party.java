package com.vcp.user.model.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Party implements Serializable
{
	private List<Customer> members = new ArrayList<Customer>();
	private List<Order> orders = new ArrayList<Order>();
	private Customer hoster;
	private Date date;

	public Party()
	{
	}

	public Party(Customer hoster, Date date)
	{
		super();
		this.hoster = hoster;
		this.date = date;
	}

	public double getSalesVolume()
	{
		double salesVolume = 0;
		for (Order order : orders)
		{
			salesVolume += order.getSalesVolume();
		}
		return salesVolume;
	}

	public List<Customer> getMembers()
	{
		return members;
	}

	public void setMembers(List<Customer> members)
	{
		this.members = members;
	}

	public List<Order> getOrders()
	{
		return orders;
	}

	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}

	public Customer getHoster()
	{
		return hoster;
	}

	public void setHoster(Customer hoster)
	{
		this.hoster = hoster;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
}
