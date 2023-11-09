package com.example.abs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abs.entity.Hospital;
import com.example.abs.services.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	private HospitalService service;
	@PostMapping("/savehospital")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		return service.save(hospital);
	}
	@GetMapping("/gethospitals")
	public List<Hospital> getHospitals(){
		return service.getHospitals();
	}
}
