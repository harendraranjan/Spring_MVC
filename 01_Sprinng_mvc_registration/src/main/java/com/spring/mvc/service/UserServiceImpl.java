package com.spring.mvc.service;

import com.spring.mvc.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public int registerUser(User user) {
		int i = userDao.saveUser(user);
		return i;
	}

	public int registerUser(org.apache.catalina.User user) {
		int i = userDao.saveUser((User) user);
		return i;
	}

}
