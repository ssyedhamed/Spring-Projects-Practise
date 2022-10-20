package com.springmvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entities.User;
import com.springmvc.service.UserService;

@Controller
//@Transactional
public class FormController {
	@Autowired
	private UserService userService;
	@RequestMapping(path = "/form",method = RequestMethod.POST)
	public String register(Model model, @ModelAttribute User user) {
//	@SuppressWarnings("resource")
//	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	
//	HibernateTemplate template=context.getBean("hibernateTemplate",HibernateTemplate.class);
//	int r=(Integer) template.save(user);
//		SessionFactory factory=new LocalSessionFactoryBean()
		if(user.getUsername().isBlank()) {
		
			return "redirect:/contact.jsp";
		}
	int r =this.userService.createUser(user);
	System.out.println("id : "+r);
		System.out.println(user);
		return "registered";
	}
}
//public class FormController {
//	@RequestMapping(path = "/form",method = RequestMethod.POST)
//	public String register(@RequestParam("username") String name, @RequestParam("email") String email,@RequestParam("password") String password, Model model) {
////		String name=request.getParameter("username");
//		model.addAttribute("username",name);
//		System.out.println(name + password +email);
//		return "registered";
//	}
//}
