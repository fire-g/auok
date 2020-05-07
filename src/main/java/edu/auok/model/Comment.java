package edu.auok.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author HaoTian
 */
@Entity
@Data
@Table(name="comments")
public class Comment {
	@Id
	private int id;
	
	private String comment;
	
	@OneToOne()
	@JoinColumn(name="doctor_id", referencedColumnName="id")
	private Doctor doctor;
	
	@OneToOne()
	@JoinColumn(name="user_id", referencedColumnName="id")
	private User user;
}
