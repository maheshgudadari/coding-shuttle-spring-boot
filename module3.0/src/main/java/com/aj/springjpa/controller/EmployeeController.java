package com.aj.springjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

	
	
	@GetMapping("/")
	public String getAllEmp() {
		return"Employee Server";
	}
	
	@GetMapping("/{id}")
	public long getEmployeeDetails(@RequestParam long id) {
		
		return id;
	}
}
