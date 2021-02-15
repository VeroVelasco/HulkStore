package com.ec.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="test")
@Entity
public class Test  implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	@Column(name="test")
	private String test;
	public Test() {
		
	}
	public Test(long id, String test) {
		this.id = id;
		this.test = test;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}

