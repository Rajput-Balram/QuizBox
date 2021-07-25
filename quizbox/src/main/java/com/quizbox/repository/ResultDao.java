package com.quizbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizbox.model.Result;

@Repository
public interface ResultDao extends JpaRepository<Result, Long>{
	public List<Result> findAllByUserId (int id);

}
