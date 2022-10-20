package com.spring.autowire;

public class Address {
	private int zipcode;
	private String city;
	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", city=" + city + "]";
	}
	public Address(int zipcode, String city) {
		super();
		this.zipcode = zipcode;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
