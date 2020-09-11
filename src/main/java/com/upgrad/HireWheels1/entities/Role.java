package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int role_id;
    private String role_name;
    @OneToMany(mappedBy = "role")
    private List<Users> user;

    public Role(){

    }
    public Role(int role_id,String role_name){
        this.role_id=role_id;
        this.role_name=role_name;
    }


    public Role(String user) {
    }
}
