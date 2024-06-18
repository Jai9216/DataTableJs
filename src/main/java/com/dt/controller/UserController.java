package com.dt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dt.entity.User;
import com.dt.repository.UserRepository;

@Controller
public class UserController {

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/show-data")
	public String showData() {
		return "show-data";
	}
	
	

}
