package edu.auok.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.auok.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
	@Query(value="select * from appointments where appointments.dest_date between :min and :max", nativeQuery=true)
	public List<Appointment> findAppointment(@Param("min")Date min, @Param("max")Date max);
	
	@Query(value="select * from appointments where appointments.dest_date between :min and :max and doctor_id = :id", nativeQuery=true)
	public List<Appointment> findAppointmentByDoctorId(@Param("min")Date min, @Param("max")Date max, @Param("id")int doctorId);
	
	@Query(value="select * from appointments, doctors where appointments.dest_date between :min and :max and doctors.department_id = :id and doctors.id = appointments.doctor_id", nativeQuery=true)
	public List<Appointment> findAppointmentByDepartmentId(@Param("min")Date min, @Param("max")Date max, @Param("id")int departmentId);
}
