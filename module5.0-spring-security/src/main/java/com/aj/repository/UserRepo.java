package com.aj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long>{

}
