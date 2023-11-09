package com.example.abs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abs.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {

}
