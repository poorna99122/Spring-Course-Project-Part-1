package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Vehicle_category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_category_id;
    @Column(unique = true,nullable = false)
    private String vehicle_category_name;
    @OneToMany(mappedBy = "vehicleCategory")
    List<com.upgrad.HireWheels1.entities.Vehicle_subcategory>vehicle_subcategories;


    public Vehicle_category(){

    }
    public Vehicle_category(int vehicle_category_id,String vehicle_category_name){
        this.vehicle_category_id=vehicle_category_id;
        this.vehicle_category_name=vehicle_category_name;
    }
}
