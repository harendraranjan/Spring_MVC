package com.mvc.contact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping(path ="/prosess",method = RequestMethod.POST)
	
//	public String Handler(@RequestParam ("name1") String userName, Model model
//			,@RequestParam ("email1") String userEmail
//			,@RequestParam ("password1") String userPassword
//			,@RequestParam ("chake1") String userCheck) {
//		model.addAttribute("userName",userName);
//		model.addAttribute("userEmail",userEmail);
//		model.addAttribute("userPassword",userPassword);
//		model.addAttribute("userCheck", userCheck);
//		
//		System.out.println(userName);
//		System.out.println(userEmail);
//		System.out.println(userPassword);
//		System.out.println(userCheck);
//		
//		return "success";
//		
//	}
	public String Handler(@ModelAttribute User user, Model model) {
		System.out.print(user);
		model.addAttribute("name1", user.getName1());
		model.addAttribute("email1", user.getEmail1());
		model.addAttribute("password1", user.getPassword1());
		model.addAttribute("check1", user.getCheck1());

		return "success";
		
	}
}
