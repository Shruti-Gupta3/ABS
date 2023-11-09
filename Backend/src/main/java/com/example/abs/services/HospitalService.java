package com.example.abs.services;

import java.util.List;

import com.example.abs.entity.Hospital;

public interface HospitalService {

	Hospital save(Hospital hospital);

	List<Hospital> getHospitals();

}
