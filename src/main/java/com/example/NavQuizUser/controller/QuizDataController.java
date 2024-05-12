package com.example.NavQuizUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NavQuizUser.entity.QuizDataModel;
import com.example.NavQuizUser.service.QuizDataService;

@RestController
@RequestMapping("/quizData")
public class QuizDataController {
	
	@Autowired
	QuizDataService quizDataService;
	
	@PostMapping("/postQuiz")
	public String createQuizData(@RequestBody QuizDataModel quizDataModel) {
		return quizDataService.addQuizData(quizDataModel);
	}
}
