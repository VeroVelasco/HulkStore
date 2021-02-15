package com.ec.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8595914818259647827L;

	@Id
	private Long id;

	@Column(name = "NAME_ROL")
	private String nameRole;

	@Column(name = "STATUS")
	private Boolean status;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nameRole
	 */
	public String getNameRole() {
		return nameRole;
	}

	/**
	 * @param nameRole the nameRole to set
	 */
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	
	
}
