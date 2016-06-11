package com.ssm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDAO;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Boolean addUser(User user) {
		Boolean res = false;
		try {
			res = userDAO.insert(user) > 0;
		} catch (Exception e) {
			log.error("insert error", e);
		}
		return res;
	}

	@Override
	public Boolean modifyUser(User user) {
		Boolean res = false;
		try {
			res = userDAO.update(user);
		} catch (Exception e) {
			log.error("update error", e);
		}
		return res;
	}

	@Override
	public User queryById(String id) {
		User t = null;
		try {
			t = userDAO.selectById(id);
		} catch (Exception e) {
			log.error("selectById error", e);
		}
		return t;
	}

	@Override
	public Boolean deleteById(String id) {
		Boolean res = false;
		try {
			res = userDAO.deleteById(id);
		} catch (Exception e) {
			log.error("deleteById error", e);
		}
		return res;
	}

}
