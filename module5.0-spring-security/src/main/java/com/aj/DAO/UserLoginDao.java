package com.aj.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class UserLoginDao {

	private String userName;
	private String password; 
	
	public UserLoginDao() {
		// TODO Auto-generated constructor stub
	}

}
