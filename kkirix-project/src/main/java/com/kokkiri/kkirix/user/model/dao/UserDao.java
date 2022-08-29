package com.kokkiri.kkirix.user.model.dao;

import java.util.Map;

import com.kokkiri.kkirix.user.model.dto.UserDto;
public interface UserDao {
	String NAMESPACE = "user.";
	
	public UserDto login(Map<String, Object> map);
	public int signup(Map<String, Object> map);
}
