package com.aj.springjpa.service;

import java.util.List;

import com.aj.springjpa.entity.EmployeeEntity;
import com.aj.springjpa.repository.EmployeeRepo;

public class EmployeeService {
	private final EmployeeRepo empRepo;
	EmployeeService(EmployeeRepo empRepo){
		this.empRepo=empRepo;
	}
	
	public List<EmployeeEntity>getAllEmployeee(){
		
		return empRepo.findAll();
		
	}

}
