package com.aj.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.entity.AdmissionEntity;
@Repository
public interface AdmissionRepo extends JpaRepository<AdmissionEntity, Long> {

}
