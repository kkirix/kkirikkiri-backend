package com.kokkiri.kkirix.user.model.dto;
import java.util.*;

public class UserDto { 
	public UserDto() {
		super();
	}
	
	public UserDto(String user_id, String password, String name, String email, Date birth) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.birth = birth;
	}
	private String user_id;
	private String password;
	private String name;
	private String email;
	private Date birth;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
}
