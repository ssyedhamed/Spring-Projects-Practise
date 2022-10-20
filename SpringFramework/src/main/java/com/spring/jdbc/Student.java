package com.spring.jdbc;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	private String name;
	private int id;
	private String branch;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	public Student(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
