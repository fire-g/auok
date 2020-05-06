package edu.auok.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.auok.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>, JpaSpecificationExecutor<Appointment>{
	@Query(value="select * from appointments where appointments.dest_date between :min and :max", nativeQuery=true)
	public List<Appointment> findAppointmentBetweenDate(@Param("min")Date min, @Param("max")Date max);
}
