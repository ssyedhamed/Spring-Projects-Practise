package net.control;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.model.User;

@Controller
public class FormController {
	@RequestMapping(path = "/submitForm" ,method = RequestMethod.POST)
	public String register(@ModelAttribute User user, BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}
		System.out.println(user);
		
		return "profile";
	}
	@RequestMapping("/register")
	public String goToRegister() {
		return "register";
	}
}
