package com.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.tools.javac.util.List;

@Controller
public class Spring_mvc {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("key_name","Harendra Ranjan");
		model.addAttribute("ID",1234);
		ArrayList<String> friends= new ArrayList<String>();
		friends.add("Harendra");
		friends.add("Deepak");
		friends.add("Rahul");
		model.addAttribute("f",friends);
		return "home";
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model=new ModelAndView();
		model.addObject("key_name","Harendra Ranjan");
		model.addObject("ID",1234);
		return model;
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("key_name","Harendra Ranjan");
		model.addAttribute("ID",1234);
		ArrayList<String> friends= new ArrayList<String>();
		friends.add("Harendra");
		friends.add("Deepak");
		friends.add("Rahul");
		model.addAttribute("f",friends);
		return "about";
	}

}
