package com.example.NavQuizUser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class NavQuizUserModel {
	@Id
	private int id;
	private String username;
	private String password;
	private String role;
}
