package com.spring.utils;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("com/spring/utils/java.utils.xml");
		Person hamed=context.getBean("person",Person.class);
		System.out.println(hamed);
	}
}
