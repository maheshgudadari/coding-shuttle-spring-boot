package com.example.module30.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class department {

	
	@PostMapping(path="/createdept")
	public String createDepartment(){
		return "server is running";
		
	}
	@GetMapping(path="/")
	public String DepartmentList() {
		
		return " server is running ";
	}
}
