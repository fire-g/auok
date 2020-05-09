package edu.auok.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.auok.repository.AppointmentRepo;
import edu.auok.service.AppointmentInfoService;
import edu.auok.model.Appointment;
import edu.auok.model.Department;
import edu.auok.model.User;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentInfoRestController {
	
	@Autowired
	private AppointmentInfoService service;
	
	@GetMapping("")
	public Map<String, Object> getData(Integer departmentId, Integer doctorId, Integer code) {
		return service.getAppointmentInfo(departmentId, doctorId, code);
	}
	
//	@GetMapping("/doctor")
//	public Map<String, Object> getByDoctorId(Integer doctorId, Integer code) {
//		return service.getAppointmentInfoByDepartmentId(doctorId, code);
//	}
}
