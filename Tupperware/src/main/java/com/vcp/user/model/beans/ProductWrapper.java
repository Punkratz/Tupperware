package com.vcp.user.model.beans;

import java.io.Serializable;


public class ProductWrapper implements Serializable
{
	private Product product;
	private int quantity;

	public ProductWrapper(Product product, int quantity)
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
	public boolean equals(Object obj)
	{
		if (obj instanceof ProductWrapper)
		{
			ProductWrapper productWrapper = (ProductWrapper) obj;
			return productWrapper.getProduct().equals(getProduct());
		}
		else if (obj instanceof Product)
		{
			Product product= (Product) obj;
			return product.equals(getProduct());
		}
		return super.equals(obj);
	}
}
