package com.collegefestspringmvc.service;

import com.collegefestspringmvc.dao.UserDao;
import com.collegefestspringmvc.model.User;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getByUserName(String userName) {
		return userDao.getByUserName(userName);
	}

}
