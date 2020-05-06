package edu.auok.service;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import edu.auok.model.Appointment;
import edu.auok.model.Department;
import edu.auok.model.Doctor;
import edu.auok.repository.AppointmentRepo;

public class AppointmentInfoServiceImp implements AppointmentInfoService {
	
	@Autowired
	AppointmentRepo repo;
	
	@Override
	public int getAppointmentInfo(Department department) {
		Date today = new Date();
		
		List<Appointment> list = repo.findAll(new Specification<Appointment>() {
			@Override
			public Predicate toPredicate(Root<Appointment> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				
				Predicate p1 = criteriaBuilder.lessThanOrEqualTo(root.get("dest_date"), today);
				
				
				return p1;
			}
			
		});
		
		
		return 0;
	}

	@Override
	public int getAppointmentInfo(Doctor doctor) {
		
		return 0;
	}

}
