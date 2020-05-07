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
	
	private static final long year = 31536000000L;
	
	private static final long month = 2592000000L;
	
	private static final long week = 604800000L;
	
	private static final long day = 86400000L;
	
	@Autowired
	AppointmentRepo repo;
	
	@Override
	public int getAppointmentInfo(Department department) {
		Date today = new Date();
		Date min = new Date(today.getTime() - month);
		List<Appointment> list = repo.findAppointment(min, today);
		
		System.out.println(today);
		System.out.println(min);
		
		return list.size();
	}

	@Override
	public int getAppointmentInfo(Doctor doctor) {
		
		return 0;
	}

}
