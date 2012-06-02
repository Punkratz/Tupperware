package com.vcp.tupperware.user.model.beans;

import java.io.Serializable;
import java.util.Date;


public class Customer implements Serializable
{
	private Date lastContact;
	private String firstName;
	private String lastName;
	private String mail;
	private String phoneNumber;
	private String street;
	private String city;
	private String zipCode;
	private Date birthDate;

	public Customer()
	{
	}

	public Customer(Date lastContact, String firstName, String lastName)
	{
		super();
		this.lastContact = lastContact;
		this.firstName = firstName;
		this.lastName = lastName;
		setMail(firstName + "@" + lastName + ".com");
	}

	@Override
	public String toString()
	{
		return firstName + ", " + lastName;
	}

	public Date getLastContact()
	{
		return lastContact;
	}

	public void setLastContact(Date lastContact)
	{
		this.lastContact = lastContact;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public Date getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Customer)
		{
			return toString().equals(obj.toString());
		}
		return super.equals(obj);
	}
}
