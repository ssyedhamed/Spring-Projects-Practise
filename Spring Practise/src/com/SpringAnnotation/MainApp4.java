package com.SpringAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp4 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Student hamed=(Student) context.getBean("student");
		System.out.println(hamed.getName());
		System.out.println(hamed.getAge());
	}
}
