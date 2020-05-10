package edu.auok.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author HaoTian
 */
@Data
@Entity
public class UserRole {
    @Id
    private int id;

    private int userId;
    private int roleId;
}
