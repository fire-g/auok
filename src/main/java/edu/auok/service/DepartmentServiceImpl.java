package edu.auok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.auok.model.Department;
import edu.auok.repository.DepartmentRepo;


/**
 * 科室服务
 * @author LW
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepo repo;
	
	@Override
	public List<Department> findAllDepartment() {
		return repo.findAll();
	}
	
	@Override
	public List<Department> findByName(String name) {
		if (name == null) {
			return repo.findAll();
		} else {
			return repo.findByKeyword("%" + name + "%");
		}

	}

}
