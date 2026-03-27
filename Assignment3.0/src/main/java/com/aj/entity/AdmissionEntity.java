package com.aj.entity;

import org.hibernate.annotations.Cascade;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Addmission_Record")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class AdmissionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long admiId;
	private long fees;
	
	@Column(name="StudentEntity")
	@OneToOne(cascade = CascadeType.ALL)
	private StudentEntity stdEnt;
	
	public AdmissionEntity() {
		// TODO Auto-generated constructor stub
	}

}
