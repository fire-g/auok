package edu.auok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.auok.model.Doctor;
//import edu.auok.repository.DoctorsRepo;

//@Service
//public class DoctorsServiceImpl implements DoctorsService{
//
//	@Autowired
//	private DoctorsRepo doctorsRepo;
//	
//	@Override
//	public Page<Doctor> findAllDoctors(String kw, Pageable pageable) {
//		return doctorsRepo.findByKeyword(kw, pageable);
//	}
//
//}
