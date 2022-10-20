package net.secondTry;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AddMain {
 public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	Add add=(Add) context.getBean("addition");
//	add.getSum();
	add.setA(30);
	add.setB(50);
	System.out.println(add.getSum());
	((ConfigurableApplicationContext)context).close();
	@SuppressWarnings("deprecation")
	XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
	Add add2=(Add) factory.getBean("addition");
	add2.setA(100);
	add2.setB(2020);
	System.out.println(add2.getSum());
 }
}
