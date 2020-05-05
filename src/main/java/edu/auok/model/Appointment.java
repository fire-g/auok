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
public class Appointment  implements Serializable {
	@Id
	private int id;
	
	//private Doctor doctor;
	
	//private User user;
	
	private boolean isCompleted;
	
	
}
