package edu.auok.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.auok.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	@Query(value="select * from departments where name like :name", nativeQuery=true)
	List<Department> findByKeyword(@Param("name") String kw); 

	Department findByName(String name);

	@Query(value="SELECT MAX(id) from departments",nativeQuery=true)
	int findMaxId();
}
