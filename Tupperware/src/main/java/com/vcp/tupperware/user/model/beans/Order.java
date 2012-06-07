package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: Orderr
 * 
 */
@Entity
public class Order implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToOne
	private Customer orderer;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@OneToMany
	private Set<OrderUnit> orderUnits;

	public Order()
	{
		super();
	}

	public Order(Customer orderer, Date creationDate, Set<OrderUnit> orderUnits)
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

	public long getId()
	{
		return id;
	}

	public Set<OrderUnit> getOrderUnits()
	{
		return orderUnits;
	}

	public void setOrderUnits(Set<OrderUnit> orderUnits)
	{
		this.orderUnits = orderUnits;
	}
}
