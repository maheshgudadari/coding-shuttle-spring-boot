package com.aj.springMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.springMVC.Entity.DepartmentEntity;
@Repository
public interface  DepartmentRepo extends JpaRepository<DepartmentEntity, Long>{
	

}
