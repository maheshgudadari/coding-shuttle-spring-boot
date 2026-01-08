package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Empolyee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long EmpId;
	private String EmpName;
	private String EmpDep;
	private String EmpSal;
	private int age;
	private boolean isActive;

}
