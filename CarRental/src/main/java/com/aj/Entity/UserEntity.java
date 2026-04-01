package com.aj.Entity;

import java.lang.reflect.GenericArrayType;

import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;
import org.hibernate.generator.values.GeneratedValues;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String phoneNumber;
	private String email;
	private String userRole;
	
	

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

}
