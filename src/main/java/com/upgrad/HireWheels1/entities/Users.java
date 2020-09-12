package com.upgrad.HireWheels1.entities;

//import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Setter
@Getter

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

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "users")
    private List<Bookings> vehicleBookings;


    public Users(){

    }

    public Users(int id,String first_name,String last_name,String password,String email,String mobile_no,int role_id,int wallet_money){
        this.first_name = first_name;
        this.last_name=last_name;
        this.password=password;
        this.email=email;
        this.mobile_no=mobile_no;
        this.role_id=role_id;
        this.wallet_money=wallet_money;



    }


    public Users(String admin, String admin1, String s, String s1, String s2, Object admin2, double v) {
    }

    public Object getUsername() {
        return null;
    }
}
