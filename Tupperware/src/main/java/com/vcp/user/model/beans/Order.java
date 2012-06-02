package com.vcp.user.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Order implements Serializable
{
	private Customer orderer;
	private Date creationDate;
	private List<ProductWrapper> productWrappers;

	public Order()
	{
	}

	public Order(Customer orderer, Date creationDate, List<ProductWrapper> productWrappers)
	{
		super();
		setOrderer(orderer);
		setCreationDate(creationDate);
		setProductWrappers(productWrappers);
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

	public void setProductWrappers(List<ProductWrapper> productWrappers)
	{
		this.productWrappers = productWrappers;
	}

	public List<ProductWrapper> getProductWrappers()
	{
		return productWrappers;
	}

	public int getProductCount()
	{
		int result = 0;
		for (ProductWrapper productWrapper : productWrappers)
		{
			result += productWrapper.getQuantity();
		}
		return result;
	}

	public double getSalesVolume()
	{
		double salesVolume = 0;
		for (ProductWrapper productWrapper : productWrappers)
		{
			salesVolume += productWrapper.getSalesVolume();
		}
		return salesVolume;
	}

	@Override
	public String toString()
	{
		return orderer.toString();
	}
}
