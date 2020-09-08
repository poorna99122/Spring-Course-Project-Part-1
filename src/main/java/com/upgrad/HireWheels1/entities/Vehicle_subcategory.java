package com.upgrad.HireWheels1.entities;

import com.upgrad.HireWheels1.entities.Vehicle;
import com.upgrad.HireWheels1.entities.Vehicle_category;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Vehicle_subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicle_subcategory_id;
    @Column(unique = true,nullable = false)
    private String vehicle_subcategory_name;
    @Column(nullable = false)
    private int price_per_day;
    @ManyToOne
    private Vehicle_category vehicleCategory;

    //private int vehicle_category_id;
    @ManyToOne
    Vehicle vehicle;

   /**
    public Vehicle_subcategory(){

    }
    public Vehicle_subcategory(int vehicle_subcategory_id,String vehicle_subcategory_name,int price_per_day,
                               int vehicle_category_id){
        this.vehicle_subcategory_id=vehicle_subcategory_id;
        this.vehicle_subcategory_name=vehicle_subcategory_name;
        this.price_per_day=price_per_day;
        //this.vehicle_category_id=vehicle_category_id;

    }
    **/
}
