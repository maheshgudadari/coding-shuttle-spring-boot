package com.aj.springjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	
	
	@GetMapping("/")
	public String getAllEmployee() {
		return"Employee Server";
	}
}
