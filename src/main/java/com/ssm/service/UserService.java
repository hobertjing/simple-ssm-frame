package com.ssm.service;

import com.ssm.model.User;

public interface UserService {

	public Boolean addUser(User user);
	
	public Boolean modifyUser(User user);
	
	public User queryById(String id);
	
	public Boolean deleteById(String id);
	
}
