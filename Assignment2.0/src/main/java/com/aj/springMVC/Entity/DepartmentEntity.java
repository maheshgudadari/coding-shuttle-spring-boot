package com.aj.springMVC.Entity;

import java.util.Date;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Department")
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private long id;
	private String title;
	private boolean isActive;
	private Date createdAt;
}
