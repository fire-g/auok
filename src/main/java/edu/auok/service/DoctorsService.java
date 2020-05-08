package edu.auok.service;

import java.util.Collection;

import edu.auok.model.Doctor;

public interface DoctorsService {
	
	public Collection<Doctor> getAllDoctors();
	public Collection<Doctor> findByName(String name);
	
//	public void setMaxpatient(int id,int maxpatient);
}
