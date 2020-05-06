package edu.auok.service;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import edu.auok.model.Appointment;
import edu.auok.model.Department;
import edu.auok.model.Doctor;
import edu.auok.repository.AppointmentRepo;

@Service
public class AppointmentInfoServiceImpl implements AppointmentInfoService {
	
	@Autowired
	AppointmentRepo repo;
	
	@Override
	public int getAppointmentInfo(Department department) {
		Date today = new Date();
		Date min = new Date(today.getTime() - 108000000);
		List<Appointment> list = repo.findAppointmentBetweenDate(min, today);
		
		
		return 0;
	}

	@Override
	public int getAppointmentInfo(Doctor doctor) {
		
		return 0;
	}

}
