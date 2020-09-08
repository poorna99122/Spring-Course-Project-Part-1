package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("locationDAO")
public interface LocationDAO extends JpaRepository<Location,Integer> {
}
