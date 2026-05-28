package com.aj.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.DAO.UserDAO;
import com.aj.DAO.UserLoginDao;
import com.aj.entity.UserEntity;

@RestController
@RequestMapping("/api")
public class UserControler {

	public UserControler() {
		// TODO Auto-generated constructor stub
	}

	
	@PostMapping("/auth/sinup")
	 public UserEntity Sinupuser(@RequestBody UserDAO userDao) {
		
		return new UserEntity();
	}
	
	@PostMapping("/auth/login")
	public String AuthenticateUser(@RequestBody UserLoginDao userLoginDao) {
		return "token";
	
	}
	
}
