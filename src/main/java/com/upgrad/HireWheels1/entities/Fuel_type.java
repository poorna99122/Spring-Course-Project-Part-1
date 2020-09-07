package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fuel_type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fuel_type_id;
    @Column(nullable = false,unique = true)
    private String fuel_type;
    @ManyToOne
    private com.upgrad.hirewheels.entities.Vehicle vehicle;



    public Fuel_type(){

    }
    public Fuel_type(int fuel_type_id,String fuel_type){
this.fuel_type=fuel_type;
this.fuel_type_id=fuel_type_id;
    }

}
