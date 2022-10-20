package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl<T> implements RowMapper<T> {

	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setBranch(rs.getString("branch"));
		return (T) student;
	}

}
