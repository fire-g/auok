package edu.auok.repository;

import org.springframework.data.repository.CrudRepository;

import edu.auok.model.Appointment;

public interface AppointmentRepo extends CrudRepository<Appointment, Integer>{

}
