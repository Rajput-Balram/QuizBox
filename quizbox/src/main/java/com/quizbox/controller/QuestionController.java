//package com.quizbox.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
////import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.quizbox.model.Question;
//import com.quizbox.service.QuestionService;
//
//@RestController
//public class QuestionController {
//	@Autowired
//	QuestionService questionService;
//	
//	
//	@GetMapping("/question")
//	public List<Question> getQuestion() {
//		return questionService.getQuestion();
//		
//	}
//	
//	@GetMapping("/question")
//	public Question getQuestion(String id) {
//		return questionService.getQuestion(id);
//		
//	}
//	
//	@PostMapping("/question")
//	public void addQuestion(@RequestBody Question qn) {
//		
//		return questionService.addQuestion(qn);
//		
//	}
//
//}
