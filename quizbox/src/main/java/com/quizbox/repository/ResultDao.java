package com.quizbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizbox.model.Result;

@Repository
public interface ResultDao extends JpaRepository<Result, Long>{
	

}
