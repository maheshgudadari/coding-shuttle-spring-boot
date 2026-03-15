package com.aj.springMVC.service;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.aj.springMVC.DAO.DepartmentDao;
import com.aj.springMVC.Entity.DepartmentEntity;
import com.aj.springMVC.repository.DepartmentRepo;

public class DepartmentService {
	private final DepartmentRepo DeptRepo;
	
	public DepartmentService(DepartmentRepo DeptRepo) {
		
		this.DeptRepo= DeptRepo;
	}
	
	public List<DepartmentDao> getAllDepartment(){
		ModelMapper mapper= new ModelMapper();
		 List<DepartmentEntity> deptEntity = DeptRepo.findAll();
		 return (List<DepartmentDao>) mapper.map(deptEntity, DepartmentDao.class);
	}
	
	public DepartmentDao AllDepartmentById(Long id){
		ModelMapper mapper= new ModelMapper();
		DepartmentEntity deptEntity= DeptRepo.findById(id).orElse(null);
		return  mapper.map(deptEntity, DepartmentDao.class);
	}
	
	public DepartmentDao saveDepartment(){
		ModelMapper mapper= new ModelMapper();
		 DepartmentEntity deptEntity = DeptRepo.save(null);
		return mapper.map(deptEntity, DepartmentDao.class);
	}

}
