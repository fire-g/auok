package edu.auok.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.auok.model.Doctor;

public interface DoctorsService {
	
	public Page<Doctor> findAllDoctors(String kw, Pageable pageable);
	
}
