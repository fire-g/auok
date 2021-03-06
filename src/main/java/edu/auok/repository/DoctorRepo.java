package edu.auok.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.auok.model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer>{
	
	@Query(value = "select * from doctors where name like :inputName", nativeQuery = true)
	List<Doctor> findByKeyword(@Param("inputName") String kw);
	
	@Query(value = "update doctor set maxpatient like ?1 where id like ?2", nativeQuery = true)
	void setMaxpatient(int id,int maxpatient);
}
