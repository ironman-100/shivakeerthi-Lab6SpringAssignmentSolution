package com.collegefestspringmvc.dao;

import com.collegefestspringmvc.model.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class RoleDaoImpl implements RoleDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addrole(Role role) {
		hibernateTemplate.save(role);

	}

}
