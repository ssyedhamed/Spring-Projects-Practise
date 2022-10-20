package com.spring.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/project/test/autowire.xml");
		Test test=(Test) context.getBean("test");
		System.out.println(test);
	}

}
