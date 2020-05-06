package edu.auok.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import edu.auok.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>, JpaSpecificationExecutor<Appointment>{
	
}
