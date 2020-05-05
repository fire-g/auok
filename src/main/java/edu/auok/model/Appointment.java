package edu.auok.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	private int id;
	
	private Doctor doctor;
	
	private User user;
	
	private boolean isCompleted;
	
	
}
