package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.springorm.entities.Student;
@Transactional
public class StudentDao {
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
		int r=(Integer) this.template.save(student);
		return r;
		
	}
	public Student getStudent(int studentId) {
		return this.template.get(Student.class, studentId);
	}
	public List<Student> getStudents(){
		return this.template.loadAll(Student.class);
	}
	public void delete(int studentId) {
		this.template.delete(this.template.get(Student.class, studentId));
	}
	public boolean update(Student student) {
		
		this.template.update(student);
		return true;
	}
	
}
