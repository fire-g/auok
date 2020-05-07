package edu.auok.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.auok.model.Doctor;

@Repository
public interface DoctorsRepo extends JpaRepository<Doctor,Integer>{
	
	@Query(value = "select * from doctors where name like :condition", nativeQuery = true)
	public Page<Doctor> findByKeyword(@Param("condition")String kw, Pageable pageable);
	
}
