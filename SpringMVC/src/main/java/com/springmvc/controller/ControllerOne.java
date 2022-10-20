package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOne {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Syed Hamed");
		List<String> friends=new ArrayList<String>();
		friends.add("Akheel");
		friends.add("Fahad");
		friends.add("Faraz");
		model.addAttribute("friends",friends);
		return "home";
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("this is about url");
		ModelAndView view=new ModelAndView();
		view.addObject("name", "syed Hamed");
		view.addObject("rollNumber", 1603);
		return view;
	}
}
