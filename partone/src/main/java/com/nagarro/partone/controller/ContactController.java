package com.nagarro.partone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.partone.model.User;
import com.nagarro.partone.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(method= RequestMethod.POST , value="/processform")
	public String handleForm(@ModelAttribute("user") User user,Model model) {
		System.out.println(user);
		this.userservice.createUser(user);
		return  "success";
	
	}

}
