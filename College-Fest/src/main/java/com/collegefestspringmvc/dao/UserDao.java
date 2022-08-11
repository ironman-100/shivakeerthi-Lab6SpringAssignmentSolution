package com.collegefestspringmvc.dao;

import com.collegefestspringmvc.model.User;

public interface UserDao {

	public void addUser(User user);

	public User getByUserName(String userName);
}
