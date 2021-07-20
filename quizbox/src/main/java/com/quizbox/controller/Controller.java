package com.quizbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.quizbox.model.Question;
import com.quizbox.model.Quizbox;
import com.quizbox.service.QuizboxService;


@RestController
public class QuizboxController {
	@Autowired
	QuizboxService quizService;
	
	@PostMapping("/question")
	public Quizbox addQuestion(@RequestBody Quizbox qn) {
		
		return quizService.addQuestion(qn);
		
	}
	
	@GetMapping("/question")
	public List<Quizbox> getAllQuestion() {
		
		return quizService.getAllQuestion();
		
	}
	
	@GetMapping("/question/{category}")
	public List<Quizbox> getAllQuestionByTopic(@PathVariable String category) {
		
		return quizService.getAllQuestionByTopic(category);
		
	}

}
