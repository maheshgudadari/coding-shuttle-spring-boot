package com.aj.springjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	public DepartmentController() {
	}

	@GetMapping("/")
	public String getAllDepartment() {
		return"department";
	}
}
