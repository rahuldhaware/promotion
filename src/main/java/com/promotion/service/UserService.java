package com.promotion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotion.dao.UserDao;
import com.promotion.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User user){
		userDao.persist(user);
	}
	
}
