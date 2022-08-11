package com.collegefestspringmvc.dao;

import com.collegefestspringmvc.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addUser(User user) {
		hibernateTemplate.save(user);

	}

	@Override
	public User getByUserName(String userName) {
		User user = (User) hibernateTemplate.find("FROM Student WHERE userName ='" + userName + "'");
		return user;
	}

}
