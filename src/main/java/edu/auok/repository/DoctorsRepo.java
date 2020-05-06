package edu.auok.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.auok.model.Doctor;

public interface DoctorsRepo extends JpaRepository<Doctor, Integer>{
	
	@Query("select d from doctors d where name like ?1")
	public Page<Doctor> findByKeyword(String kw, Pageable pageable);
	
}
