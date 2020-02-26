package com.puntosingular.base.dto;

import java.util.Date;
import java.util.List;

import com.puntosingular.base.models.Role;

public class UserDTO {

	private Long id;
	
	private String name;
	
	private String lastname;
	
	private boolean status;
	
	private Date creatData;
	
	private List<Role> roles;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getCreatData() {
		return creatData;
	}

	public void setCreatData(Date creatData) {
		this.creatData = creatData;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}