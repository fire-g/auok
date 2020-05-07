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
	
	@Query(value = "select * from doctors where name like ?1", nativeQuery = true)
	public Page<Doctor> findByKeyword(String kw, Pageable pageable);
	
	@Query("update doctor set maxpatient like ?1 where id like ?2", nativeQuery = true)
	public void setMaxpatient(int id,int maxpatient);
}
