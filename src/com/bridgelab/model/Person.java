package com.bridgelab.model;

public class Person 
{
   private String name,lastname,state,city,address;
   private  String Zipcode;
   private long mobileno;

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLastname() 
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getZipcode()
	{
		return Zipcode;
	}

	public void setZipcode(String zipcode) 
	{
		Zipcode = zipcode;
	}

	public long getMobileno() 
	{
		return mobileno;
	}

	public void setMobileno(long mobileno) 
	{
		this.mobileno = mobileno;
	}
  
}
