package com.example.NavQuizUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class QuizDataModel {
	
	@Id
	private int id;
	private String quizTitle;
    private String quizSubject;
    private int quizDuration;
    private int quizQuestionQuant;
    private String quizDescription;
	
}
