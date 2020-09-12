package com.upgrad.HireWheels1.service;

import com.upgrad.HireWheels1.Exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheels1.entities.Users;

public interface UsersService {
    public Users createUser() throws UserAlreadyExistsException;


}
