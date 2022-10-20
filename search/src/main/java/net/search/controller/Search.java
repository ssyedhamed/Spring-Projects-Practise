package net.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Search {
	@RequestMapping(path = "/google",method = RequestMethod.POST)
	public RedirectView google(@RequestParam("query") String query) {
		System.out.println(query);
		String url="https://www.google.com/search?q="+query; 
		System.out.println(url);
		RedirectView view=new RedirectView();
		view.setUrl(url);
		return view;
	}
}
