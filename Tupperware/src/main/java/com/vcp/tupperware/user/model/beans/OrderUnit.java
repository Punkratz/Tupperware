package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;


public class OrderUnit implements Serializable
{
	private Product product;
	private int quantity;

	public OrderUnit()
	{
		super();
	}

	public OrderUnit(Product product, int quantity)
	{
		super();
		setProduct(product);
		setQuantity(quantity);
	}

	public String getName()
	{
		return product.getName();
	}

	public void setName(String name)
	{
		product.setName(name);
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public double getPrice()
	{
		return product.getPrice();
	}

	public double getSalesVolume()
	{
		return product.getPrice() * quantity;
	}

	public void setPrice(double price)
	{
		product.setPrice(price);
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	@Override
	public String toString()
	{
		return product + ", " + quantity + "Stk.";
	}
}
