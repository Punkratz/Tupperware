package com.vcp.tupperware.user.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.model.SelectItem;
import com.vcp.tupperware.user.model.beans.Customer;
import com.vcp.tupperware.user.model.beans.Order;
import com.vcp.tupperware.user.model.beans.OrderUnit;
import com.vcp.tupperware.user.model.beans.Product;


public class UserModel implements Serializable
{
	private final List<Customer> customers = new ArrayList<Customer>();
	private final List<Product> products = new ArrayList<Product>();
	private final List<SelectItem> customerItems = new ArrayList<SelectItem>();
	private final List<Order> orders = new ArrayList<Order>();

	public UserModel()
	{
		customers.add(new Customer(new Date(), "Elke", "Potucek"));
		customers.add(new Customer(new Date(), "Larissa", "Potucek"));
		customers.add(new Customer(new Date(), "Vincent", "Potucek"));
		customers.add(new Customer(new Date(), "Ute", "Prohaska"));
		customers.add(new Customer(new Date(), "Gisela", "Schmitt"));
		products.add(new Product("Product1", 5));
		products.add(new Product("Product2", 15));
		Customer customer = customers.get(0);
		List<OrderUnit> productWrappers = new ArrayList<OrderUnit>();
		productWrappers.add(new OrderUnit(new Product("Product1", 25), 5));
		getOrders().add(new Order(customer, new Date(), productWrappers));
		productWrappers.add(new OrderUnit(new Product("Product2", 10), 2));
		getOrders().add(new Order(customer, new Date(), productWrappers));
		for (Customer customer2 : customers)
		{
			customerItems.add(new SelectItem(customer2, customer2.toString()));
		}
	}

	public List<SelectItem> getSelectItem()
	{
		return customerItems;
	}

	public List<Order> getOrders()
	{
		return orders;
	}

	public List<Customer> getCustomers()
	{
		return customers;
	}

	public List<Product> getProducts()
	{
		return products;
	}
}
