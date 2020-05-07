package edu.auok.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.auok.model.Doctor;
import edu.auok.service.DoctorsService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/listDoctors")
public class DoctorsRestController {
	
	@Autowired
	private DoctorsService doctorsService;
	
	@RequestMapping(value="",method = RequestMethod.GET,produces="application/json")
	public ResponseEntity<Collection<Doctor>> doctors(String name){
		Collection<Doctor> doctors;
		if(name == null)
			doctors = doctorsService.getAllDoctors();
		else
			doctors = doctorsService.findByName(name);
		return new ResponseEntity<Collection<Doctor>>(doctors,HttpStatus.OK);
	}
	
	@RequestMapping(value="/maxpatient",method = RequestMethod.POST,produces="application/json")
	public ResponseEntity<doctor> setMaxpatient(@RequestBody int id,int maxpatient){
		clinicService.setMaxpatient(id, maxpatient);
		return new ResponseEntity<doctor>(HttpStatus.CREATED);
	}
}
