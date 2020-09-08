package com.upgrad.HireWheels1.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Date;


@Setter
@Getter
@Data
@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;


    @Column( nullable = false)
    private Date pickup_date;
    @Column( nullable = false)
    private  Date dropoff_date;
    @Column( nullable = false)
    private  Date  booking_date;
    @Column( nullable = false)
    private int amount;
    @ManyToOne
    private com.upgrad.HireWheels1.entities.Location location;
    private int location_id;

    @ManyToOne
    private Vehicle vehicle;
    private int vehicle_id;

    @ManyToOne
    private Users users;
    private int  user_id;
    @javax.persistence.Id
    private String id;

    public Bookings(){

}
public Bookings(int booking_id,Date pickup_date,Date dropoff_date,Date booking_date,int amount,int location_id,
                int vehicle_id,int user_id){
    this.booking_id=booking_id;
    this.pickup_date=pickup_date;
    this.dropoff_date=dropoff_date;
    this.booking_date=booking_date;
    this.amount=amount;
    this.location_id=location_id;
    this.vehicle_id=vehicle_id;
    this.user_id=user_id;

}


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
