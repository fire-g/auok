package edu.auok.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.auok.repository.AppointmentRepo;

import edu.auok.model.Appointment;
import edu.auok.model.User;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentInfoRestController {
	
	@Autowired
	private AppointmentRepo repo;
	
	@GetMapping("")
	public Iterable<Appointment> home() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}
}
