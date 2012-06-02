package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;


public class Product implements Serializable
{
	private String name;
	private double price;

	public Product()
	{
	}

	public Product(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public boolean equals(Object obj)
	{
		return toString().equals(obj.toString());
	}
}
