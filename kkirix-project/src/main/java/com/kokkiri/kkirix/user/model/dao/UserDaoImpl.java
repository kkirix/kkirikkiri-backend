package com.kokkiri.kkirix.user.model.dao;

import com.kokkiri.kkirix.user.UserController;
import com.kokkiri.kkirix.user.model.dto.UserDto;

import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	SqlSessionTemplate sqlSession;
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Override
	public int signup(Map<String, Object> map) {
		return this.sqlSession.insert("user.signup", map);
	}
	
	@Override
	public UserDto login(Map<String, Object> map) {
		UserDto res = null;
		
		try {
			res = sqlSession.selectOne("user.login",map);
			logger.info("userDaoImpl " + res.getUser_id());
			return res;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
 
