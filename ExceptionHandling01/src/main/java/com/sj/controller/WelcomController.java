package com.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WelcomController {

	
	@GetMapping("/welcome")
	public String getWelcomMessage(Model model) {
		
		model.addAttribute("msg","hello goodmorning");
		int i = 1/0;
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage(Model model) {
		
		model.addAttribute("msg","hello ,how are you?");
		return "index";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String Exceptionhandeling(Exception e) {
		System.out.println(e.getMessage());
		return "error";
	}
	
	
}
