package edu.auok.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;

/**
 *
 * 修改0.1:
 * @author HaoTian
 * 添加lombok注解，优化代码结构
 * 
 * 修改0.2：
 * @author LW
 * 注解中添加表名
 */
@Entity
@Data
@Table(name="doctors")
public class Doctor implements Serializable {
	@Id
	private int id;
	
	private String account;
	
	private String password;
	
	private String name;
	
	private String sex;
	
	private String introduction;
	
	@OneToOne()
	@JoinColumn(name="department_id", referencedColumnName="id")
	private Department department;
	
	private int maxPatient;
}
