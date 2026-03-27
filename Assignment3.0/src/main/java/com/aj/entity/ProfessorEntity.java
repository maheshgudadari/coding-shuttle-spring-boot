package com.aj.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Professor")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class ProfessorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name="SubjectEntity")
	@ManyToOne
	private List<SubjectEntity> subEntity;
	
	@Column(name="studentEntity")
	@OneToMany
	private List<StudentEntity> stdEntity;

	public ProfessorEntity() {
		// TODO Auto-generated constructor stub
	}

}
