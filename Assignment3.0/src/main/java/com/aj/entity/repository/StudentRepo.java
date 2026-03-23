package com.aj.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.entity.ProfessorEntity;
import com.aj.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
