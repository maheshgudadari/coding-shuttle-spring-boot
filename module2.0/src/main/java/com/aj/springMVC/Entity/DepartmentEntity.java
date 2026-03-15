package com.aj.springMVC.Entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Department")


public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE )
	private long id;
	private String title;
	private boolean isActive;
	private Date createdAt;
}
