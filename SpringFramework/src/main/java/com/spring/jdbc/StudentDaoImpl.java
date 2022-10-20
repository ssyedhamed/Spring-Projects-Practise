package com.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
private  JdbcTemplate template;
//private  JdbcTemplate getTemplateObj() {
//	AbstractApplicationContext context =
//			new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.xml");
//	this.template=context.getBean("jdbcTemplate", JdbcTemplate.class);
//	context.close();
//	return template;
//}
public JdbcTemplate getTemplate() {
	return template;
}
public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
	public int insert(Student student) {
		// TODO Auto-generated method stub
		this.template=getTemplate();
		String insertQ="insert into student(name,branch) values(?,?)";
		int r=template.update(insertQ,student.getName(),student.getBranch());
		return r;
	}
	
	public int update(Student student) {
		this.template=getTemplate();
		String updateQ="update student set name=?,branch=? where id=?";
		int r=template.update(updateQ,student.getName(),student.getBranch(),student.getId());
		return r;
	}
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		this.template=getTemplate();
		String deleteQ="delete from student where id=?";
		int r=template.update(deleteQ,studentId);
		return r;
	}
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		this.template=getTemplate();
		String selectQ="select * from student where id=?";
		RowMapper<Student> studentMapper=new RowMapperImpl<Student>();
		Student student=template.queryForObject(selectQ, studentMapper,studentId);
		return student;
	}
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		this.template=getTemplate();
		String selectAllQ="select * from student";
		List<Student> students=template.query(selectAllQ, new RowMapperImpl<Student>());
		return students;
	}
	

}
