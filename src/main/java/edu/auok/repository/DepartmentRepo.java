package edu.auok.repository;

import org.springframework.data.repository.CrudRepository;

import edu.auok.model.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer>{

}
