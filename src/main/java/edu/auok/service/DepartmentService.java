package edu.auok.service;

import java.util.List;

import edu.auok.model.Department;

public interface DepartmentService {
	public List<Department> findAllDepartment();
	public List<Department> findByName(String name);
}
