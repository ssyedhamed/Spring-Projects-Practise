package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.xml");
		ApplicationContext context=new  AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		Student student1=context.getBean("student",Student.class);
		student1.setName("Syed Hamed");
		student1.setBranch("Information Technology");
//		Student student2=context.getBean("student",Student.class);
//		student2.setId(2);
//		student2.setName("Mohammed Akheel");
//		student2.setBranch("IT");
//		int r=studentDao.insert(student1);
//		int r=studentDao.update(student2);
//		int r=studentDao.delete(student2.getId());
//		System.out.println("affected rows : "+r);
		System.out.println(studentDao.getStudent(4));
//		System.out.println(studentDao.getStudents());
		for(Student s:studentDao.getStudents()) {
			System.out.println(s);
		}
		
	}

}
