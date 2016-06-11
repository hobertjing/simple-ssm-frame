package com.ssm.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ssm.model.User;

@Repository
public interface UserDAO {
	
	public int insert(User user) throws Exception;
	
	public Boolean update(User user) throws Exception;
	
	public User selectById(String id) throws Exception;
	
	public Boolean deleteById(String id) throws Exception;
	
	public List<User> selectByMap(Map<String, Object> params) throws Exception;
	
	public int countByMap(Map<String, Object> params) throws Exception;
}
