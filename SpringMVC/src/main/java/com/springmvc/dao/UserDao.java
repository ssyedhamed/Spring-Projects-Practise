package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entities.User;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate template;
	@Transactional
	public int saveUser(User user) {
	
		return (Integer) this.template.save(user);
	}
}
