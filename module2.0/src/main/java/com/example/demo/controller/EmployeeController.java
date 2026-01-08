package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Empolyee;
import com.example.demo.bean.Employee;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.repository.EmpolyeeRepo;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private final EmployeeService empService;
	
	public EmployeeController(EmployeeService empService){
		this.empService = empService;
	}
	
	@GetMapping("/")
	public String getServer() {
		return "I am up and running";
	}
	
	
	@GetMapping(path = "/getEmployeeList")
	public EmployeeDTO getEmployeeList() {
		
		return new EmployeeDTO();
	}
	
	@GetMapping(path = "/getEmployeeList/{EmpId}")
	public Optional<Empolyee>  getEmployee(@PathVariable Long EmpId) {
		return this.empService.findEmployeeById(EmpId);
	}
	
	@PostMapping(path="/createEmployee")
	public EmployeeDTO createEmployee(@PathVariable EmployeeDTO emp) {
		
		return this.empService.createEmployee(emp);
	}

}
