package com.quizbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizbox.model.Quizbox;
import com.quizbox.repository.QuizboxDao;


@Service
public class QuizboxService {
	
	@Autowired
	QuizboxDao quizdao;

	public Quizbox addQuestion(Quizbox qn) {
		 
		return quizdao.save(qn) ;
	}

	public List<Quizbox> getAllQuestion() {
		 
		return quizdao.findAll();
	}

	public List<Quizbox> getAllQuestionByTopic(String category) {
		  
		return quizdao.findAllByCategory(category);
	}

}
