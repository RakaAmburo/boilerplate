package com.boiler.entities;

import java.util.Set;

import com.boiler.config.security.ViewProfiles;
import com.fasterxml.jackson.annotation.JsonView;

@JsonView(ViewProfiles.Public.class)
public class User {

	private Long id;
	private String userName;
	private String passWord;
	
	@JsonView(ViewProfiles.ShowAll.class)
	private Set<Role> roles;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
