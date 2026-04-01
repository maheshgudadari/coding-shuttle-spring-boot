package com.aj.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserControler {

	public UserControler() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public String startServer() {
		return"user api server start";
	}

}
