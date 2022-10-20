package com.spring.project.test;

public class Address {
	private String landmark;
	private int zipcode;
	public Address() {
		super();
		System.out.println("inside address constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [landmark=" + landmark + ", zipcode=" + zipcode + "]";
	}
	public Address(String landmark, int zipcode) {
		super();
		this.landmark = landmark;
		this.zipcode = zipcode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
}
