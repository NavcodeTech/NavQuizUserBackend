package com.example.NavQuizUser.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    @OneToMany(mappedBy = "quizDataModel",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<QuestionDetailsModel> questionDetailsModelSet;
	
}
