package com.aj.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Addmission_Record")
public class AdmissionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long admiId;
	private long fees;
	
	@Column(name="StudentEntity")
	@JoinColumn(name = "student_id")
	private StudentEntity stdEnt;
	
	public AdmissionEntity() {
		// TODO Auto-generated constructor stub
	}

}
