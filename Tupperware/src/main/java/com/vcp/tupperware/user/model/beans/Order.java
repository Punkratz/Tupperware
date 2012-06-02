package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Order implements Serializable
{
	private Customer orderer;
	private Date creationDate;
	private List<OrderUnit> orderUnits;

	public Order()
	{
	}

	public Order(Customer orderer, Date creationDate, List<OrderUnit> orderUnits)
	{
		super();
		setOrderer(orderer);
		setCreationDate(creationDate);
		setOrderUnits(orderUnits);
	}

	public Customer getOrderer()
	{
		return orderer;
	}

	public void setOrderer(Customer orderer)
	{
		this.orderer = orderer;
	}

	public Date getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}

	public List<OrderUnit> getOrderUnits()
	{
		return orderUnits;
	}

	public void setOrderUnits(List<OrderUnit> orderUnits)
	{
		this.orderUnits = orderUnits;
	}
}
