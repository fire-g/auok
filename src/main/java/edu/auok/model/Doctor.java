package edu.auok.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int id;
	
	private String account;
	
	private String password;
	
	private String name;
	
	private String sex;
	
	private String introduction;
	
//	private Schedule schedule;
	
//	private Department department;
	
	public Doctor() {
		super();
	}
	
	public Doctor(int id, String account, String password, String name, String sex, String introduction) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.introduction = introduction;
//		this.department = department;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
}
