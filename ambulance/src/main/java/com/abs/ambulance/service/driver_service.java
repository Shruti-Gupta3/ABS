package com.abs.ambulance.service;

import java.util.List;

import com.abs.ambulance.Entity.Driver;

public interface driver_service {
	Driver save(Driver driver);

    List<Driver> getPrevAmb();

    List<Driver> getviewBookings();

}
