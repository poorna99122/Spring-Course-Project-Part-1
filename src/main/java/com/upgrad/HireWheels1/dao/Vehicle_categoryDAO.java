package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicle_categoryDAO")
public interface Vehicle_categoryDAO extends JpaRepository<Vehicle_category,Integer> {
}
