package edu.auok.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.auok.model.Department;
import edu.auok.repository.DepartmentRepo;
import edu.auok.service.DepartmentService;

/**
 * 科室获取api
 * @author LW
 *
 */

@RestController
@RequestMapping("/api/v1")
public class DepartmentRestController {
	
	@Autowired
	DepartmentService service;
	
	@GetMapping("/departments")
	public List<Department> getDepartment() {
		return service.getAllDepartment();
	}
}
