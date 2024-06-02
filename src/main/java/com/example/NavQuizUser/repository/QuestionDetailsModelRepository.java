package com.example.NavQuizUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NavQuizUser.entity.QuestionDetailsModel;

@Repository
public interface QuestionDetailsModelRepository extends JpaRepository<QuestionDetailsModel, Integer> {
	QuestionDetailsModel findByQuestionTitle(String questionTitle);
}
