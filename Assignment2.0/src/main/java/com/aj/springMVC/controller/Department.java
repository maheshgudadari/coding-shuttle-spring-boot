package com.aj.springMVC.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aj.springMVC.Entity.DepartmentEntity;
import com.aj.springMVC.doa.DepartmentDao;
import com.aj.springMVC.repository.DepartmentRepo;
import com.fasterxml.jackson.annotation.JsonAlias;

@RestController
public class Department {
	private final DepartmentRepo DeptRepo;
	
//	GET: /departments
//	POST: /departments
//	PUT: /departments
//	DELETE: /departments
//	GET: /departments/{id}
	public Department(DepartmentRepo DeptRepo) {
		this.DeptRepo=DeptRepo;
	}
	
	@GetMapping(path="/departments")
	public List<DepartmentEntity> getDepartmentList(){
		return DeptRepo.findAll();
	}
	
	@GetMapping(path="/departments/{id}")
	public DepartmentEntity  getDep(@RequestParam Long id) {
		return DeptRepo.findById(id).orElse(null);
	}
	
	@PostMapping(path="/departments")
	public DepartmentEntity createDept(@RequestBody DepartmentEntity DepartmentEntity) {
		
	 return DeptRepo.save(DepartmentEntity);
	}
	
	@DeleteMapping(path="/departments/id")
	public void deleteDept(@RequestParam Long id) {
		 DeptRepo.deleteById(id);
	}
	
	

}
