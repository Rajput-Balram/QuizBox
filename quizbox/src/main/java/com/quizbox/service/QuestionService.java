//package com.quizbox.service;
//
////import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.quizbox.model.Question;
//import com.quizbox.repository.QuestionDao;
//
//@Service
//public class QuestionService {
//	 
//	@Autowired
//	QuestionDao questionDao;
//		 
//	public List<Question> getQuestion() {
//		return questionDao.findAll();
//	}
//	
//	public Question getQuestion(String id) {
//		return questionDao.getById(id);
//	}
//	
//	public void addQuestion(Question question) {
//		QuestionDao.save(question);
//	}
//	
//
//
//	 
//	
//}
