package com.example.module30.bean;

import java.beans.JavaBean;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JavaBean
@AutoConfiguration
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {

	private long Id;
	private String DeptName;
	
	Department(){
		
	}
	
	
	
}
