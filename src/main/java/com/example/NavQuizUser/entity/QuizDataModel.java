package com.example.NavQuizUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class QuizDataModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String quizTitle;
    private String quizSubject;
    private int quizDuration;
    private int quizQuestionQuant;
    private String quizDescription;
    @OneToMany
    private QuestionDetailsModel questionDetailsModel[]; 
	
}
