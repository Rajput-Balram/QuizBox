package com.quizbox.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.quizbox.model.Login;
import com.quizbox.model.User;
import com.quizbox.repository.UserDao;

class TestQuizBoxApp {
	
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserDao userDao;

	@Test
	public void TestAddUser() {
		User user = new User();
		user.setId(1);
		user.setName("Balram");
		user.setEmail("balram@gmail1.com");
		user.setMobile("9999999999");
		user.setPassword("12345");
		
		Mockito.when(userDao.save(user)).thenReturn(user);
		assertEquals(user, userService.addUser(user),"Add user into database");
		
	}
	
//	@Test
//	public void TestLoginUser() {
//		Login user = new Login();
//		user.s
//	}

}
