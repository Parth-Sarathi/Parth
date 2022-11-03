package com.nagarro.partone.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping(value="/")
//	public ModelAndView test(HttpServletResponse response) throws IOException{
//		return new ModelAndView("home");
//	}
	
	@RequestMapping(value="/home")
	public String home(Model model) {
		System.out.println("Home url");
		model.addAttribute("name","Parth");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about url");
		return "about";
	}
}
