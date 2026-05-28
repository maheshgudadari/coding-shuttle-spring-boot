package com.aj.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class UserDAO {
	
	private String userName;
	private String password;
	private String UserRole;

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}

}
