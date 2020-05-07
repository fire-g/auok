package edu.auok.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appointmentinfo")
public class AppointmentInfoController {
	
	@GetMapping()
	public String appointmentInfo() {
		return "appointmentinfo";
	}
}
