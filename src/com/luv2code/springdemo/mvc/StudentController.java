package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//group route

@RequestMapping("/student")

public class StudentController {
	//
	@RequestMapping("/registration")
	public String showForm(Model model) {
		
		// create instance of the student class
		
		Student student = new Student();
		
		// add student instance to model 
		
		model.addAttribute("student", student);
		
		// view 
		
		return "registration";
	}
	
	//processing form 
	@RequestMapping("student/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "confirmation";
	}
}
