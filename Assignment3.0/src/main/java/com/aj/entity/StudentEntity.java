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
@Table(name="Student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuId;
	private String name;
	
	@Column(name="professorEntity")
	@JoinColumn(name="professor_id")
	private List<ProfessorEntity> proEntity;
	
	@Column(name="subjectEntity")
	@JoinColumn(name="subject_id")
	private List<SubjectEntity> subEntity;
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

}
