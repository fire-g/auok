package edu.auok.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 修改0.1:
 * @author HaoTian
 * 添加lombok注解，优化代码结构
 * 
 * 修改0.2：
 * @author LW
 * 注解中添加表名
 * 
 */
@Entity()
@Data
@Table(name="appointments")
public class Appointment  implements Serializable {
	@Id
	private int id;
	
	@OneToOne()
	@JoinColumn(name="doctor_id", referencedColumnName="id")
	private Doctor doctor;
	
	
	@OneToOne()
	@JoinColumn(name="user_id", referencedColumnName="id")
	private User user;
	
	private Date destDate;
	
	private Date date;
	
	private boolean isCompleted;
}
