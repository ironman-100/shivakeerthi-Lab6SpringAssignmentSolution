package com.collegefestspringmvc.service;

import com.collegefestspringmvc.dao.RoleDao;
import com.collegefestspringmvc.model.Role;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public void addRole(Role role) {
		roleDao.addrole(role);
	}

}
