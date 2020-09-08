package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int location_id;
    @Column(nullable = false)
    private String location_name;
    @Column(nullable = false)
    private String address;
   @ManyToOne
   private com.upgrad.HireWheels1.entities.City city;
    private int city_id;
    @Column(nullable = false)
    private int pincode;
    @ManyToOne
    private Vehicle vehicle;
    public Location(){

    }

    public Location(int location_id,String location_name,String address,int city_id,int pincode){
     this.location_id=location_id;
     this.location_name=location_name;
     this.address=address;
     this.city_id=city_id;
     this.pincode=pincode;

    }



}
