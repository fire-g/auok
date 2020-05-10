package edu.auok.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import edu.auok.service.AppointmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import edu.auok.model.Appointment;
import edu.auok.model.Department;
import edu.auok.model.Doctor;
import edu.auok.repository.AppointmentRepo;
import edu.auok.repository.DepartmentRepo;
import edu.auok.repository.DoctorRepo;

@Service
public class AppointmentInfoServiceImpl implements AppointmentInfoService {

	private static final long year = 31536000000L;

	private static final long month = 2592000000L;

	private static final long week = 604800000L;

	private static final long day = 86400000L;

	@Autowired
	AppointmentRepo repo;
	
	@Autowired
	DoctorRepo doctorRepo;
	
	@Autowired
	DepartmentRepo departmentRepo;

	/**
	 * code = 1,表示一周内的信息 code = 2,表示一个月内的信息 code = 3,表示三个月内的信息
	 */
	@Override
	public Map<String, Object> getAppointmentInfo(int departmentId, int doctorId, int code) {
		Map<String, Object> map = new HashMap<>();
		List<Integer> data = new ArrayList<>();
		List<String> labels = new ArrayList<>();
		Date now = new Date();
		if (departmentId != -1 && doctorId == -1) {
			switch (code) {
			case 1:
				setDataByDepartmenntId(now.getTime(), 7, 1, data, labels, departmentId);
				break;
			case 2:
				setDataByDepartmenntId(now.getTime(), 30, 3, data, labels, departmentId);
				break;
			case 3:
				setDataByDepartmenntId(now.getTime(), 90, 9, data, labels, departmentId);
				break;
			case 4:
				setDataByDepartmenntId(now.getTime(), 180, 18, data, labels, departmentId);
				break;
			}
			Optional<Department> department = departmentRepo.findById(departmentId);
			map.put("label", department.get().getName());
		} else if (departmentId == -1 && doctorId != -1){
			switch (code) {
			case 1:
				setDataByDoctorId(now.getTime(), 7, 1, data, labels, doctorId);
				break;
			case 2:
				setDataByDoctorId(now.getTime(), 30, 3, data, labels, doctorId);
				break;
			case 3:
				setDataByDoctorId(now.getTime(), 90, 9, data, labels, doctorId);
				break;
			case 4:
				setDataByDoctorId(now.getTime(), 180, 18, data, labels, doctorId);
				break;
			}
			Optional<Doctor> doctor = doctorRepo.findById(doctorId);
			map.put("label", doctor.get().getName());
		}

		map.put("data", data);
		map.put("labels", labels);

		return map;
	}
	
	private void setDataByDepartmenntId(long start, int total, int step, List<Integer> data, List<String> label, int departmentId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date min = new Date(start - total * day);
		Date max;
		for (int i = 0; i < total / step; i++) {
			max = new Date(min.getTime() + day * step);
			data.add(repo.findAppointmentByDepartmentId(min, max, departmentId).size());
			label.add(sdf.format(max));
			min = max;
		}
	}
	
	private void setDataByDoctorId(long start, int total, int step, List<Integer> data, List<String> label, int doctorId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date min = new Date(start - total * day);
		Date max;
		for (int i = 0; i < total / step; i++) {
			max = new Date(min.getTime() + day * step);
			data.add(repo.findAppointmentByDoctorId(min, max, doctorId).size());
			label.add(sdf.format(max));
			min = max;
		}
	}
}
