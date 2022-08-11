package com.collegefestspringmvc.service;

import com.collegefestspringmvc.dao.UserDao;
import com.collegefestspringmvc.model.User;
import com.collegefestspringmvc.security.StudentFestUserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class StudentFestUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.getByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("Not found");
		}
		return new StudentFestUserDetails(user);
	}

}
