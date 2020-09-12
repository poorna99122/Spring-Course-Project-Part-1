package com.upgrad.HireWheels1.service;


import com.upgrad.HireWheels1.Exceptions.UserAlreadyExistsException;
import com.upgrad.HireWheels1.dao.UsersDAO;
import com.upgrad.HireWheels1.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "users")

public class UsersServiceImpl implements UsersService {
    @Autowired
    Users users;
    @Autowired
    UsersDAO usersDAO;


    @Override
    public Users getUsers(LoginFunction loginFunction) throws UserAlreadyExistsException {
        if(usersDAO.findByEmail(loginFunction.getEmail())==null){
            throw  new Exception("User not Registered");

        }else{
            throw new UserAlreadyExistsException("This username already exists please choose another : " + users.getUsername());
        }
    }
}
