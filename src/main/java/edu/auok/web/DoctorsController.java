package edu.auok.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorsController {
	
	@RequestMapping("/listDoctors")
	public String welcome() {
		return "listDoctors";
	}
	
}
