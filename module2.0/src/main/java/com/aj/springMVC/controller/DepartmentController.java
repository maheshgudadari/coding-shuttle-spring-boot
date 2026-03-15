package com.aj.springMVC.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aj.springMVC.DAO.DepartmentDao;
import com.aj.springMVC.Entity.DepartmentEntity;
import com.aj.springMVC.repository.DepartmentRepo;
import com.aj.springMVC.service.DepartmentService;

@RestController
public class DepartmentController {
	
	private final DepartmentService deptService;

//	PUT: /departments

	public DepartmentController(DepartmentService deptService) {
		this.DeptRepo=DeptRepo;
		this.deptService=deptService;
	}
	
	@GetMapping(path="/departments")
	public List<DepartmentEntity> getDepartmentList(){
		return deptService.getAllDepartment();
	}
	
	@GetMapping(path="/departments/{id}")
	public DepartmentEntity  getDep(@RequestParam Long id) {
		System.out.println(id);
		return deptService.AllDepartmentById(id);
	}
	
	@PostMapping(path="/departments")
	public DepartmentDao createDept(@RequestBody DepartmentDao inputDepartmentEntity) {
	 
		System.out.println(inputDepartmentEntity);
		return deptService.deptService(inputDepartmentEntity);
	 
	}
	
	@DeleteMapping(path="/departments/id")
	public void deleteDept(@RequestParam Long id) {
		 DeptRepo.deleteById(id);
	}
	
	

}
