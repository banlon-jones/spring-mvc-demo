package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//add controller annotation
@Controller

public class HomeController {
	
	//add request mapping
	@RequestMapping("/")
	public String showPage(){
		return "main-menu";
	}
}
