package com.upgrad.HireWheels1.dao;

import com.upgrad.HireWheels1.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleDAO")
public interface RoleDAO extends JpaRepository<Role,Integer> {
   public  Role findByName(String name);
}
