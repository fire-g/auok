package edu.auok.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.auok.model.Doctor;
import edu.auok.repository.DoctorsRepo;

@Service
public class DoctorsServiceImpl implements DoctorsService{

	@Autowired
	private DoctorsRepo doctorsRepo;
	
	@Override
	public Collection<Doctor> getAllDoctors() {
		return (Collection<Doctor>)doctorsRepo.findAll();
	}
	
	@Override
	public Collection<Doctor> findByName(String name) {
		return (Collection<Doctor>)doctorsRepo.findByKeyword("%"+name+"%");
	}
	
//	@Override
//	public void setMaxpatient(int id, int maxpatient) {
//		return doctorsRep.setMaxpatient(id,maxpatient);
//	}

}
