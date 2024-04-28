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
	
	public String getUserByUsername(String username) {
		if (navUserRepo.findByUsername(username) != null) {
			return navUserRepo.findByUsername(username).toString();
		} else {
		return "User doesn't exist";
		}
	}
	
	public String updatePassword(NavQuizUserModel user) {
		if (navUserRepo.findByUsername(user.getUsername()) != null) {
			NavQuizUserModel regUser = navUserRepo.findByUsername(user.getUsername());
			regUser.setPassword(user.getPassword());
			navUserRepo.save(regUser);
            return "password updated successfully";
        } else {
        	return "User doesn't exists";
		}
	}
	
	public String deleteUser(String username) {
		if (navUserRepo.findByUsername(username) != null) {
			NavQuizUserModel regUser = navUserRepo.findByUsername(username);
			navUserRepo.delete(regUser);
            return "User deleted successfully";
        } else {
        	return "User doesn't exists";
		}
	}
}
