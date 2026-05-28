package com.aj.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aj.repository.UserRepo;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Service
public class UserService implements UserDetailsService{

	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		// TODO Auto-generated constructor stub
		
		this.userRepo=userRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		userRepo.findBfindByuserName(username);
		return null;
	}
	
	

}
