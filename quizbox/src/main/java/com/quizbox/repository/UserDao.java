package com.quizbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizbox.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
