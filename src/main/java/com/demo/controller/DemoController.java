package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dao.UserRepository;
import com.demo.model.User;

@Controller
@RequestMapping(value={"/home","","/"})
public class DemoController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String test(){
		return "hello";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(String name, String password){
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		userRepository.save(user);

		return "{success: true}";
	}
}
