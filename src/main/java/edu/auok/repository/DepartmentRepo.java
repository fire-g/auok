package edu.auok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.auok.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> { 

}
