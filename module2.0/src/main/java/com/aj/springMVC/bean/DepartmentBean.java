package com.aj.springMVC.bean;

import java.beans.JavaBean;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JavaBean
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class DepartmentBean {
	
	private Number id;
	private String title;
	private boolean isActive;
	private Date createdAt;

}
