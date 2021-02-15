package com.ec.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec.core.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByStatusTrueAndUserNameAndPassword(String username, String password	);	

}
