package com.example.NavQuizUser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NavQuizUser.entity.QuestionDetailsModel;
import com.example.NavQuizUser.entity.QuizDataModel;
import com.example.NavQuizUser.repository.QuestionDetailsModelRepository;
import com.example.NavQuizUser.repository.QuizDataModelRepository;

@Service
public class QuizDataService {
	
	@Autowired
	QuizDataModelRepository quizDataModelRepo;
	
	@Autowired
	QuestionDetailsModelRepository questionDetailsModelRepo;

	public String addQuizData(QuizDataModel quizDataModel) {
		if(quizDataModel != null && !checkQuizExists(quizDataModel))
		{
			if (quizDataModel.getQuestionDetailsModelSet() != null) {
			quizDataModelRepo.save(quizDataModel);
			System.out.println(quizDataModel.getQuestionDetailsModelSet());
			for(QuestionDetailsModel question: quizDataModel.getQuestionDetailsModelSet())
			{
				question.setQuizDataModel(quizDataModel);
				questionDetailsModelRepo.save(question);
			}
			}
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
