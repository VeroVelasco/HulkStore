package com.ec.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec.core.entity.Test;
@Repository("testRepository")
public interface TestRepository   extends JpaRepository<Test, Serializable>{
	
	public abstract Test findByTest(String test);
	public abstract Test findById(long id);
}




