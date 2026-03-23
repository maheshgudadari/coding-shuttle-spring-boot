package com.aj.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name="Subject")
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subId;
	private String title;
	
	@Column(name="professorEntity")
	private ProfessorEntity professorEntity;
	
	@Column(name="StudentsEntity")
	@JoinColumn(name="Student_id")
	private  List<StudentEntity> StudentsEntity;

	public SubjectEntity() {
		// TODO Auto-generated constructor stub
	}

}
