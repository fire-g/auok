package edu.auok.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * 修改0.1:
 * @author HaoTian
 * 添加lombok注解，优化代码结构
 */
@Entity
@Data
public class Department {
	@Id
	private int id;
	
	private String name;
	
}
