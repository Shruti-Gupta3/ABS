package com.abs.ambulance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abs.ambulance.Entity.Driver;

@Repository
public interface driver_repo extends JpaRepository<Driver, String>{

}
