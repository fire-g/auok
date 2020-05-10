package edu.auok.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author HaoTian
 */
@Data
@Entity
public class Permission {
    @Id
    private int id;
    private String name;
    private String url;
    private String description;
    private int pid;

    //关系两边都作为主控
    // joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
    @ManyToMany
    @JoinTable(name = "role_permission", joinColumns = {@JoinColumn(name = "permission_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    @JsonIgnore
    private Set<Role> roles;

    @Transient
    @JsonIgnore
    private Set<String> roleNames;

    public Set<String> getRoleNames() {
        if (roleNames == null) {
            roleNames = new HashSet<>();
            for (Role role : roles) {
                this.roleNames.add(role.getName());
            }
        }
        return roleNames;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + id +
                ", permissionName='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", roleNames=" + roleNames +
                '}';
    }
}

