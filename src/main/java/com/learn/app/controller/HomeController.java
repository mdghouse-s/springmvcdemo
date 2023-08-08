package com.learn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("projectname", "MY AWESOME MVC PROJECt");
		return "home";
	}
	
	@GetMapping("/mview")
	public ModelAndView mview(@RequestParam String name) {
		ModelAndView mview = new  ModelAndView("myview");
		mview.addObject("year", 2023);
		mview.addObject("Company", "Anand Rathi");
		mview.addObject("query", name);
		return mview;	
	}
}