package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController {
	
	// show hello world form 
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// process form input
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	// process form 2
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request, Model model) {
		//read form data and assign to userName
		String userName = request.getParameter("userName");
		
		//convert username to uppercase
		
		userName = userName.toUpperCase();
		
		// adding values to model 
		
		model.addAttribute("name", userName);
		
		return "helloworld";
	}

}
