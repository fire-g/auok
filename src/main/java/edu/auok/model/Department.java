package edu.auok.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	
	private String name;
	
}
