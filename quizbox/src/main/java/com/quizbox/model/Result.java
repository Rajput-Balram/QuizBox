package com.quizbox.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Result {
	@Id
	 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userId;
	private String userName;
	private String category;
	private Date date;
	private String score;
	
	
}
