package com.quizbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizbox.model.Quizbox;

public interface QuizboxDao extends JpaRepository<Quizbox, Long>{
	public List<Quizbox> findAllByCategory(String category);

}
