package com.example.NavQuizUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NavQuizUser.entity.NavQuizUserModel;

@Repository
public interface NavQuizUserRepository extends JpaRepository<NavQuizUserModel,Integer> {
	
	NavQuizUserModel findByUsername(String username);
	
}
