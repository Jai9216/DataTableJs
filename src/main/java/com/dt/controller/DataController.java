package com.dt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dt.entity.User;
import com.dt.repository.UserRepository;

@RestController
public class DataController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/data")
	public List<User> getData(){
		List<User> users=userRepository.findAll();
		System.out.println(userRepository.findAll());
		return users;
	}

}
