package com.aj.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Student")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuId;
	private String name;
	
	@Column(name="professorEntity")
	@OneToMany
	private List<ProfessorEntity> proEntity;
	
	@Column(name="subjectEntity")
	@OneToMany
	private List<SubjectEntity> subEntity;
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

}
