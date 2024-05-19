package com.example.NavQuizUser.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NavQuizUser.entity.QuizDataModel;
import com.example.NavQuizUser.service.QuizDataService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/quizData")
public class QuizDataController {
	
	@Autowired
	QuizDataService quizDataService;
	
	@PostMapping("/postQuiz")
	public ResponseEntity<Map<String,String>> createQuizData(@RequestBody QuizDataModel quizDataModel) {
		System.out.println(quizDataModel);
		Map<String,String> response = new HashMap<String,String>();
		if(quizDataService.addQuizData(quizDataModel).equals("Quiz data added")) {
			response.put("message","quiz data added");
			return ResponseEntity.ok(response);
		} else {
			response.put("message","quiz can't be added");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
}
