package com.example.NavQuizUser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NavQuizUser.entity.NavQuizUserModel;
import com.example.NavQuizUser.repository.NavQuizUserRepository;

@Service
public class NavQuizUserService {
	
	@Autowired 
	NavQuizUserRepository navUserRepo;
	
	public String createUser(NavQuizUserModel user) {
		if (navUserRepo.findByUsername(user.getUsername()) != null) {
            return "Username already exists";
        } else {
        	navUserRepo.save(user);
        	return "Success";
		}
	}
	
	public NavQuizUserModel getUserByUsername(String username) {
		
		return navUserRepo.findByUsername(username);
	}
}
