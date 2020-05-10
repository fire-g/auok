package edu.auok.service.impl;

import java.util.Collection;
import java.util.List;

import edu.auok.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.auok.model.Doctor;
import edu.auok.repository.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;
	
	@Override
	public List<Doctor> findAllDoctors() {
		return doctorRepo.findAll();
	}
	
	@Override
	public List<Doctor> findByName(String name) {
		if (name == null) {
			return doctorRepo.findAll();
		} else {
			return doctorRepo.findByKeyword("%"+name+"%");
		}
		
	}
	
	@Override
	public void setMaxpatient(int id, int maxpatient) {
		doctorRepo.setMaxpatient(id,maxpatient);
	}

}
