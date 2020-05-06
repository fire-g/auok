package edu.auok.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.auok.model.Doctor;

@Repository
public interface DoctorsRepo extends JpaRepository<Doctor,Integer>{
	
	@Query("select d from doctors d where d.name like ?1")
	public Page<Doctor> findByKeyword(String kw, Pageable pageable);
	
}
