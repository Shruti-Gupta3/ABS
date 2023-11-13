package com.abs.ambulance.service;
import com.abs.ambulance.Entity.Driver;
import com.abs.ambulance.Repository.driver_repo;

//import com.project.abs.entity.driver;
//import com.project.abs.repository.driver_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class driver_impl implements driver_service{
    @Autowired
    private driver_repo repo;

    @Override
    public Driver save(Driver driver) {
        return repo.saveAndFlush(driver);
    }

    @Override
    public List<Driver> getPrevAmb() {
        return null;
    }

    @Override
    public List<Driver> getviewBookings() {
        return null;
    }
	}