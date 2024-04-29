package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.entity.user;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		
		return"home";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	@RequestMapping(path="/createUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute user User) {
		System.out.print(User);
		
		return "register";
	}

}
