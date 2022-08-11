package com.collegefestspringmvc.controller;

import com.collegefestspringmvc.model.Role;
import com.collegefestspringmvc.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleCotroller {

	@Autowired
	private RoleService roleService;

	@PostMapping("/role/add")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
}
