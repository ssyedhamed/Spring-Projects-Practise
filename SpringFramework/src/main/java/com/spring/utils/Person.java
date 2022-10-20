package com.spring.utils;

import java.util.List;
import java.util.Set;

public class Person {
	private String name;
	private int age;
	private List<String> friends;
	private Set<String> contacts;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, List<String> friends, Set<String> contacts) {
		super();
		this.name = name;
		this.age = age;
		this.friends = friends;
		this.contacts = contacts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getContacts() {
		return contacts;
	}
	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", friends=" + friends + ", contacts=" + contacts + "]";
	}
	
	
}
