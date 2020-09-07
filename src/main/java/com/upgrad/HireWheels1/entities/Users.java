package com.upgrad.HireWheels1.entities;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column( nullable = false)
    private  String first_name;
    private String last_name;
    @Column( nullable = false)
    private String password;
    @Column( nullable = false,unique = true)
    private String email;
    @Column( nullable = false,unique = true)
    private String mobile_no;
    @Column( nullable = false)
    private int role_id;

    private int wallet_money;
}
