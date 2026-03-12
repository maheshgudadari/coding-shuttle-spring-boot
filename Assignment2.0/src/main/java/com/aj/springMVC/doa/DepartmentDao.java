package com.aj.springMVC.doa;

import java.util.Date;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Repository
public class DepartmentDao {
	private Number id;
	private String title;
	private boolean isActive;
	private Date createdAt;
}
