package com.aj.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.entity.SubjectEntity;

@Repository
public interface SubjectRepo extends JpaRepository<SubjectEntity, Long> {

}
