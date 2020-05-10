package edu.auok.service.impl;

import java.util.List;

import edu.auok.service.DepartmentService;
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

	@Override
	public void save(Department department) {
		Department d=repo.findByName(department.getName());
		if(d!=null){
			d.setIntroduction(department.getIntroduction());
			repo.save(d);
			return;
		}
		int id=repo.findMaxId();
		department.setId(id+1);
		repo.save(department);
	}

}
