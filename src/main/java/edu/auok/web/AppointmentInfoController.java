package edu.auok.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.auok.service.DepartmentService;
import edu.auok.service.DoctorService;

@Controller
@RequestMapping("/appointmentinfo")
public class AppointmentInfoController {
	
	private DoctorService doctorService;
	private DepartmentService departmentService;
	
	
	@Autowired
	public AppointmentInfoController(DoctorService doctorService, DepartmentService departmentService) {
		super();
		this.doctorService = doctorService;
		this.departmentService = departmentService;
	}

	@GetMapping()
	public String appointmentInfo() {
		return "search";
	}
	
	@GetMapping("/doctor")
	public String getDoctorInfo(Model model, @RequestParam("content") String content) {
		model.addAttribute("doctors", doctorService.findByName(content));
		
		return "doctorresult";
	}
	
	@GetMapping("/department")
	public String getDepartmentInfo(Model model, @RequestParam("content") String content) {
		model.addAttribute("departments", departmentService.findByName(content));
		
		return "departmentresult";
	}
	
	@GetMapping("/result")
	public String getResult(Model model, @RequestParam("departmentid") Integer departmentId, 
			@RequestParam("doctorid") Integer doctorId) {
		
		model.addAttribute("doctorid", doctorId);
		model.addAttribute("departmentid", departmentId);
		
		return "appointmentinfo";
	}
}
