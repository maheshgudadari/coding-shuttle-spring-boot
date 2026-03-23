package com.aj.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.entity.ProfessorEntity;
@Repository
public interface ProfessorRepo extends JpaRepository<ProfessorEntity, Long> {

}
