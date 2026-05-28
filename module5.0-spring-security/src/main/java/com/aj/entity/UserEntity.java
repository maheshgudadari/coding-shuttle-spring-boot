package com.aj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="User")
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class UserEntity {

	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String userName;
	private String password;
	private String UserRole;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

}
