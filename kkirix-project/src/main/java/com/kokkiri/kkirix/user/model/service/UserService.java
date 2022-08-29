package com.kokkiri.kkirix.user.model.service;

import java.util.Map;
import com.kokkiri.kkirix.user.model.dto.UserDto; 

public interface UserService {

	String signup(Map<String, Object> map);
	UserDto login(Map<String, Object> map);
}
