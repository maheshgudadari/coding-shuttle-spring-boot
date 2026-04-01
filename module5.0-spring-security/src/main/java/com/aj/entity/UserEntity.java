package com.aj.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class UserEntity {

	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String userName;
	private String password;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

}
