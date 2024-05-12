package com.example.NavQuizUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NavQuizUser.entity.QuizDataModel;

@Repository
public interface QuizDataModelRepository extends JpaRepository<QuizDataModel, Integer> {
	QuizDataModel findByQuizTitle(String quizTitle);
}
