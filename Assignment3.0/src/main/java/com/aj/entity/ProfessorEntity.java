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
@Table(name="Professor")
public class ProfessorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name="SubjectEntity")
	@JoinColumn(name = "subject_id")
	private List<SubjectEntity> subEntity;
	
	@Column(name="studentEntity")
	@JoinColumn(name = "student_id")
	private List<StudentEntity> stdEntity;

	public ProfessorEntity() {
		// TODO Auto-generated constructor stub
	}

}
