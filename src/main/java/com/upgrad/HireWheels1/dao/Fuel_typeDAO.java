package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Fuel_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fuel_typeDAO")
public interface Fuel_typeDAO extends JpaRepository<Fuel_type,Integer> {
}
