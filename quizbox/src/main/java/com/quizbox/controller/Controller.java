package com.quizbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizbox.model.Login;
import com.quizbox.model.Quizbox;
import com.quizbox.model.Result;
import com.quizbox.model.User;
import com.quizbox.service.QuizboxService;
import com.quizbox.service.UserService;

@CrossOrigin("http://localhost:3000")
@RestController
public class Controller {
	
/***********************************"Quiz-Controller"**************************************************/	
	@Autowired
	QuizboxService quizService;
	@Autowired
	UserService userService;
	
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
	
/*********************************"User-Controller"**************************************************/	

	@GetMapping("/user")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@PostMapping("/signup")
	public String signUp(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@PostMapping("/login")
	public Object logIn(@RequestBody Login login) {
		return userService.logIn(login);
	}
	
/*********************************"Take-Quiz-Controller"**************************************************/
	
	@PostMapping("/score-evaluation/{id}/{userName}")
	public Object checkScore(@RequestBody List<Quizbox> test, @PathVariable int id,@PathVariable String userName) {
		
		return quizService.checkScore(test, id, userName);
	}
	
	@GetMapping("/check-score/{id}")
	public List<Result> getScoreCard(@PathVariable int id) {
		return quizService.getScoreCard(id);
	}
}
