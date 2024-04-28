package com.example.NavQuizUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NavQuizUser.entity.NavQuizUserModel;
import com.example.NavQuizUser.service.NavQuizUserService;

@RestController
@RequestMapping("/navQuizUser")
public class NavQuizUserController {
	
	@RequestMapping("/")
	public String testApi() {
		return "hi";
	}
	
	@Autowired
	NavQuizUserService navQuizUserService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody NavQuizUserModel user) {
		navQuizUserService.createUser(user);
		return "Registered Successfully";
	}
	
	@GetMapping("/getUser/{user}")
	public String getUserByUsername(@PathVariable String user)
	{
		return navQuizUserService.getUserByUsername(user).toString();	
	}
	
	@PutMapping("/updatePassword")
	public String updatePassword(@RequestBody NavQuizUserModel user) {
		return navQuizUserService.updatePassword(user);
	}
	
	@DeleteMapping("/deleteUser/{user}")
	public String deleteUser(@PathVariable String user)
	{
		return navQuizUserService.deleteUser(user);
	}
}
