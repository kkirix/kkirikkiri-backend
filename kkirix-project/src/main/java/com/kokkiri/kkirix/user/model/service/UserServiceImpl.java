package com.kokkiri.kkirix.user.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kokkiri.kkirix.user.model.dao.UserDao;
import com.kokkiri.kkirix.user.model.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public String signup(Map<String, Object> map) {
	    int affectRowCount = this.userDao.signup(map);
	    if (affectRowCount ==  1) {
	        return map.get("user_id").toString();
	    }
	    return null;

	}

	@Override
	public UserDto login(Map<String, Object> map) {
		return userDao.login(map);
	}

}