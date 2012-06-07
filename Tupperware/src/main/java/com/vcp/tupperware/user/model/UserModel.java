package com.vcp.tupperware.user.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.vcp.tupperware.user.model.beans.Customer;
import com.vcp.tupperware.user.model.beans.Order;
import com.vcp.tupperware.user.model.beans.Product;


/**
 * Entity implementation class for Entity: UserModell
 * 
 */
@Entity
public class UserModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private final Set<Customer> customers = new HashSet<Customer>();
	@OneToMany
	private final Set<Product> products = new HashSet<Product>();
	@OneToMany
	private final Set<Order> orders = new HashSet<Order>();

	public UserModel()
	{
		super();
	}

	public long getId()
	{
		return id;
	}

	public Set<Customer> getCustomers()
	{
		return customers;
	}

	public Set<Order> getOrders()
	{
		return orders;
	}

	public Set<Product> getProducts()
	{
		return products;
	}
}
