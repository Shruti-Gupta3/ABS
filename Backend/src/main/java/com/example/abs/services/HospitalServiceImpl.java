package com.example.abs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abs.entity.Hospital;
import com.example.abs.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalRepository repo;
	
	@Override
	public Hospital save(Hospital hospital) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(hospital);
	}

	@Override
	public List<Hospital> getHospitals() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
