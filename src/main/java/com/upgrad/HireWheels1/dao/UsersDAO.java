package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {
}
