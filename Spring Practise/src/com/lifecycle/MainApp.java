package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld print=(HelloWorld) context.getBean("message");
		print.setMessage("hello worlds2222");
		print.getMessage();
		context.registerShutdownHook();
//		context.close();
	}

}
