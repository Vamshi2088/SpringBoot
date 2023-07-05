package com.examp;

public class Address {

	private String location;
	
	private String street;
	
	private String pincode;

	public Address(String location, String street,String pincode) {
		this.location = location;
		this.street = street;
		this.pincode=pincode;
	}
	public Address(Address a) {
		
		this(a.getLocation(),a.getStreet(),a.getPincode());
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreet() {
		return street;
	}

	public String getPincode() {
		return pincode;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", street=" + street + "]";
	}
	
	
}
