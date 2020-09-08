package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository("bookingDAO")
public interface BookingDAO extends JpaRepository<Bookings, Integer> {
}
