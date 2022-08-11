package com.collegefestspringmvc.controller;

import com.collegefestspringmvc.model.User;
import com.collegefestspringmvc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user/add")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@GetMapping("/user/{userName}")
	public User getByUserName(String userName) {
		return userService.getByUserName(userName);
	}
}
