package com.quizbox.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizbox.model.Quizbox;
import com.quizbox.model.Result;
import com.quizbox.repository.QuizboxDao;
import com.quizbox.repository.ResultDao;



@Service
public class QuizboxService {
	
	@Autowired
	QuizboxDao quizdao;
	@Autowired
	ResultDao  resultDao;

	public Quizbox addQuestion(Quizbox qn) {
		 
		return quizdao.save(qn) ;
	}

	public List<Quizbox> getAllQuestion() {
		 
		return quizdao.findAll();
	}

	public List<Quizbox> getAllQuestionByTopic(String category) {
		 
		List<Quizbox> totalQuestions = quizdao.findAllByCategory(category);
		
		Collections.shuffle(totalQuestions);
		List<Quizbox> selectedQuestions = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			selectedQuestions.add(totalQuestions.get(i));
		}
		return selectedQuestions;
	}

	public Result checkScore(List<Quizbox> test, int id, String userName) {
		//List<Quizbox> questionList = new ArrayList<>();
		int score=0;
		
		for(Quizbox qn: test) {
			if(qn.getChoice()!=null && qn.getChoice().equalsIgnoreCase(qn.getAnswer()))
				score++;
		}
		
		Quizbox question = test.get(0);
		Date date = new Date(System.currentTimeMillis());
		Result result = new Result();
		result.setCategory(question.getCategory());
		result.setUserId(id);
		result.setScore(score);
		result.setDate(date);
		result.setUserName(userName);
		return resultDao.save(result);
		 
	}

	public List<Result> getScoreCard(int id) {
		 
		return resultDao.findAllByUserId(id);
	}

	public List<Result> getAllScore() {
		 
		return resultDao.findAll();
	}

}
