package com.ec.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.core.entity.User;
import com.ec.core.repository.UserRepository;
import com.ec.core.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getActiveUserByUserNameAndPassword(String userName, String password) {
		return this.userRepository.findByStatusTrueAndUserNameAndPassword(userName, password);
	}


}
