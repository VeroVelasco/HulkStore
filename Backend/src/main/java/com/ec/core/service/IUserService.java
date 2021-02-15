package com.ec.core.service;

import org.springframework.stereotype.Component;

import com.ec.core.entity.User;

@Component
public interface IUserService {

	User getActiveUserByUserNameAndPassword(String userName, String password);
	
	
}
