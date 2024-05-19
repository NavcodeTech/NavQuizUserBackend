package com.example.NavQuizUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class QuestionDetailsModel {
	@Id
	private int id;
	private String questionTitle;
	private String questionContent;
	private String option1;
	private String option2;
	private String option3;
	private String option4;

}
