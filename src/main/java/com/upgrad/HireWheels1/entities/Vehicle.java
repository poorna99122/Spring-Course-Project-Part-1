package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_id;
    @Column( nullable = false)
    private String vehicle_model;
    private String vehicle_number;
    @OneToMany(mappedBy = "vehicle")
    List<com.upgrad.HireWheels1.entities.Vehicle_subcategory> vehicle_subcategories;
    @Column( nullable = false)
    private String color;
    @OneToMany(mappedBy = "vehicle", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    //@JoinColumn(name="location_id")
     List<com.upgrad.HireWheels1.entities.Location> locations;

    @OneToMany(mappedBy = "vehicle")
    List<Fuel_type> fuel_types;
    private int fuel_type_id;
    @Column( nullable = false)
    private int availability_status;
    @Column( nullable = false)
    private String vehicle_image_url;


    public Vehicle(){

    }
    public Vehicle(int vehicle_id,String vehicle_model,String vehicle_number,String color,int fuel_type_id,int availability_status,String vehicle_image_url){

    }



}
