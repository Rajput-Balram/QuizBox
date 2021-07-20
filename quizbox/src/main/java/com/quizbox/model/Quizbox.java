package com.quizbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Quizbox {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String category;
	private String qTitle;	 
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;	
	private String answer;
	private String choice;

}
