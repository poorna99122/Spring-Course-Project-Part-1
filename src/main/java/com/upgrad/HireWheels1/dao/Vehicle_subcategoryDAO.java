package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Vehicle_subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehicle_subcategoryDAO")
public interface Vehicle_subcategoryDAO extends JpaRepository<Vehicle_subcategory,Integer> {
}
