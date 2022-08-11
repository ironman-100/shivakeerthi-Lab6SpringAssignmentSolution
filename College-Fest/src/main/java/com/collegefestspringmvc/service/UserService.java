package com.collegefestspringmvc.service;

import com.collegefestspringmvc.model.User;

public interface UserService {

	public void addUser(User user);

	public User getByUserName(String userName);

}
