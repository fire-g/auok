package edu.auok.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author HaoTian
 */

@Entity
@Data
@Table(name="schedules")
public class Schedule {
	@Id
	private int id;
}
