package com.aj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.entity.UserEntity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findBfindByuserName(String userName);

}
