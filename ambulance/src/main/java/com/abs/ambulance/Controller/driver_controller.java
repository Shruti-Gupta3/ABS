package com.abs.ambulance.Controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abs.ambulance.Entity.Driver;
import com.abs.ambulance.service.driver_service;

	@RestController
	public class driver_controller {
	    @Autowired
	    private driver_service service;
	    @PostMapping("/saveDriver")
	    public Driver saveDriver(@RequestBody Driver Driver) {
	        return service.save(Driver);
	    }
	    @GetMapping("/getPrevAmb")
	    public List<Driver> getPrevAmb(){
	        return service.getPrevAmb();
	    }
	    @GetMapping("/viewBookings")
	    public List<Driver> viewBookings(){
	        return service.getviewBookings();
	    }
	}
