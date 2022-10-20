package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
public static void main(String[] args) {
//@SuppressWarnings("resource")
ApplicationContext context =
new ClassPathXmlApplicationContext("Beans.xml");
HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
obj.getMessage();
((ConfigurableApplicationContext)context).close();
}
}
