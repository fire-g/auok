package edu.auok.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.auok.model.Doctor;
import edu.auok.service.DoctorsService;

@Controller
public class DoctorsRestController {
	
	@Autowired
	private DoctorsService doctorsService;
	
	@RequestMapping("/listDoctors")
	public String list(String kw, Model model, Pageable pageable) {
		Page<Doctor> ppu = doctorsService.findAllDoctors(kw, pageable);
		model.addAttribute("pages", ppu);
		return "listdoctors";
	}
	
}
