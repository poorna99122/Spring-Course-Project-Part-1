package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {
}
