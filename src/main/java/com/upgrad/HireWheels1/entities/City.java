package com.upgrad.HireWheels1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int city_id;
    @Column(nullable = false)
    private String city_name;
    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<Location> locations;



    public City(){

    }
    public City(int city_id,String city_name){
        this.city_id=city_id;
        this.city_name=city_name;

    }

}
