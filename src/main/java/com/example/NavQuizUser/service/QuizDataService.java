package com.example.NavQuizUser.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NavQuizUser.entity.QuizDataModel;
import com.example.NavQuizUser.repository.QuizDataModelRepository;

public class QuizDataService {
	
	@Autowired
	QuizDataModelRepository quizDataModelRepo;

	public String addQuizData(QuizDataModel quizDataModel) {
		if(!checkQuizExists(quizDataModel))
		{
			quizDataModelRepo.save(quizDataModel);
			return "Quiz data added";
		}
		else
			return "Quiz with this title already exist"; 
	}
	
	public boolean checkQuizExists(QuizDataModel quizDataModel)
	{
		if(quizDataModelRepo.findByQuizTitle(quizDataModel.getQuizTitle()) != null)
			return true;
		else
			return false;
	}
	
}
