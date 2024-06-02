package com.example.NavQuizUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class QuestionDetailsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String questionTitle;
	private String questionContent;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private QuizDataModel quizDataModel;
}
