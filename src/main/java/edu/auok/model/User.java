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
public class User implements Serializable {
	@Id
	private int id;
	
	private String account;
	
	private String password;
	
	private String name;
	
	private String sex;
	
	public User() {
		super();
	}

	public User(int id, String account, String password, String name, String sex) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
	}
}
