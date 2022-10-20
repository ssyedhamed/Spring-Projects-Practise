package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/autowireAnnotations.xml");
	Student s1=context.getBean("student",Student.class);
	System.out.println(s1);
}
}
