package edu.auok.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
