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
@Table(name = "role")
public class Role {

    @Id
    private int id;

    private String name;



//    @JoinTable(name = "role_permission", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {
//            @JoinColumn(name = "permission_id") })//joinColumns写的都是本表在中间表的外键名称， inverseJoinColumns写的是另一个表在中间表的外键名称。
//    @JsonIgnore
//    @ManyToMany(mappedBy = "roles")
//    private Set<Permission> permissions;

    @Transient
    @JsonIgnore
    private Set<String> url;

    public Set<String> getUrl() {
//        if(url==null){
//            url=new HashSet<>();
//            for (Permission permission : permissions) {
//                this.url.add(permission.getUrl());
//            }
//        }
        return url;
    }
}
