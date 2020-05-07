package edu.auok.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.appointment.model.doctor;
import edu.auok.model.Doctor;
import edu.auok.service.DoctorsService;

@Controller
@RequestMapping("/api/v1/listDoctors")
public class DoctorsRestController {
	
	@Autowired
	private DoctorsService doctorsService;
	
	@GetMapping("")
	public String listDocotrs(String kw, Model model, Pageable pageable) {
		if(kw != null) {
			kw = "%" + kw + "%";
		}else {
			kw = "%%";
		}
		Page<Doctor> ppu = doctorsService.findAllDoctors(kw, pageable);
		model.addAttribute("pages", ppu);
		
		System.out.println(kw);
		return "listdoctors";
	}
	
	@RequestMapping(value="/maxpatient",method = RequestMethod.POST,produces="application/json")
	public ResponseEntity<doctor> setMaxpatient(@RequestBody int id,int maxpatient){
		clinicService.setMaxpatient(id, maxpatient);
		return new ResponseEntity<doctor>(HttpStatus.CREATED);
	}
}
