package com.quizbox.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizbox.model.Login;
import com.quizbox.model.User;
import com.quizbox.repository.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	//add new user(signUp)
	public Object addUser(User user) {
		List<User> userList = new ArrayList<>();
		userList = userDao.findAll();
		for(User usr : userList) {
			if(usr.getEmail().equalsIgnoreCase(user.getEmail()))
				return null;
		}
		userDao.save(user);
		return user;
	}
	
	//get all user
	public List<User> getUsers() {
		 
		return userDao.findAll();
	}
   
	// login user
	public Object logIn(Login login) {
		 List<User> userList = new ArrayList<>();
		 userList = userDao.findAll();
		 for(User usr : userList) {
			 if(usr.getEmail().equalsIgnoreCase(login.getEmail()) && usr.getPassword().equals(login.getPassword()))
				 return usr;
		 }
		return null;
	}

}
