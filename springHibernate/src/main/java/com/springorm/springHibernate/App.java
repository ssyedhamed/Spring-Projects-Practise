package com.springorm.springHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=
    			new ClassPathXmlApplicationContext("beans.xml");
//    	Student student=context.getBean("student",Student.class);
//    	student.setName("Mohammad Akheel");
//    	student.setBranch("IT");
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//    	boolean r=studentDao.update(student);
//    	System.out.println("affected rows: "+r);
//    	System.out.println(studentDao.getStudent(2));
//    	studentDao.delete(3);
//    	studentDao.delete(4);
    	Student student=studentDao.getStudent(2);
    	student.setName("Syed Mahmood Naqshbandi");
    	studentDao.update(student);
    	List<Student> students=studentDao.getStudents();
    	for(Student s:students) {
    		System.out.println(s);
    	}
    }
}
