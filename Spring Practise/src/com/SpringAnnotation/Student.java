package com.SpringAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String  name;
	private int age;
	public String getName() {
		return name;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
//	@SuppressWarnings("deprecation")
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
}
