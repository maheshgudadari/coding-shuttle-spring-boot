package com.aj.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Subject")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subId;
	private String title;
	
	@Column(name="professorEntity")
	@OneToOne
	private ProfessorEntity professorEntity;
	
	@Column(name="StudentsEntity")
	@OneToMany
	private  List<StudentEntity> StudentsEntity;

	public SubjectEntity() {
		// TODO Auto-generated constructor stub
	}

}
