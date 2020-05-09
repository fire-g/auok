package edu.auok.service;

import java.util.Map;

import edu.auok.model.Department;
import edu.auok.model.Doctor;

public interface AppointmentInfoService {
	public Map<String, Object> getAppointmentInfo(int departmentId, int doctorId, int code);
}
