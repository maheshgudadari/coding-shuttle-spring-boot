package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Empolyee;
import com.example.demo.dto.EmployeeDTO;

@Repository
public interface EmpolyeeRepo extends JpaRepository <Empolyee, Long> {

	EmployeeDTO save(EmployeeDTO emp);

}
