package com.ssm.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.common.BaseTest;
import com.ssm.model.User;

/**
 * 订单服务测试类
 * @author Hobert.J
 */
public class UserServiceTest extends BaseTest {

	@Autowired
	private UserService userService;

//	@Test
	public void addUserTest() {
		User user = new User();
		user.setId("1");
		user.setName("test");
		Boolean res = userService.addUser(user);
		assertTrue(res);
	}
	
	@Test
	public void queryByIdTest() {
		User user = userService.queryById("1");
		assertNotNull(user);
		System.out.println(user.toString());
	}
	
//	@Test
	public void deleteByIdTest() {
		Boolean res = userService.deleteById("1");
		assertTrue(res);
	}
	
}
