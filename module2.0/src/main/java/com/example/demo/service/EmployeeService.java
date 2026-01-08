package com.example.demo.service;

import java.util.Optional;

import com.example.demo.Entity.Empolyee;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.repository.EmpolyeeRepo;

public class EmployeeService {
	
	private final EmpolyeeRepo emprepo;

	public EmployeeService(EmpolyeeRepo emprepo) {
		this.emprepo = emprepo;
	}

	public Optional<Empolyee> findEmployeeById(Long empId) {
		// TODO Auto-generated method stub
		return this.emprepo.findById(empId);
	}

	public EmployeeDTO createEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		return this.emprepo.save(emp);
	}
	
	

}
