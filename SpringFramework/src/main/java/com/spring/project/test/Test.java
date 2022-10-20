package com.spring.project.test;

public class Test {
	private Address address;
	private String name;
	public Test(Address address, String name) {
		super();
		System.out.println("inside const");
		this.address = address;
		this.name = name;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Test [address=" + address + ", name=" + name + "]";
	}
	
}
