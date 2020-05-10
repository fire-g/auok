package edu.auok.service;

import java.util.List;

import edu.auok.model.Department;

/**
 * @author HaoTian
 */
public interface DepartmentService {
	List<Department> findAllDepartment();
	List<Department> findByName(String name);
	void save(Department department);
}
