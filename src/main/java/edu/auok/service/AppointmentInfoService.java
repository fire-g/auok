package edu.auok.service;

import edu.auok.model.Department;
import edu.auok.model.Doctor;

public interface AppointmentInfoService {
	public int getAppointmentInfo(Department department);
	public int getAppointmentInfo(Doctor doctor);
}
