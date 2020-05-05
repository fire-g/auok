package edu.auok.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * 修改0.1:
 * @author HaoTian
 * 添加lombok注解，优化代码结构
 */
@Entity
@Data
public class Doctor  implements Serializable {
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
}
