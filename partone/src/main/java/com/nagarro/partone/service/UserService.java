package com.nagarro.partone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.partone.dao.UserDao;
import com.nagarro.partone.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	public int createUser(User user) {
		return this.userdao.saveUser(user);
	}
}

