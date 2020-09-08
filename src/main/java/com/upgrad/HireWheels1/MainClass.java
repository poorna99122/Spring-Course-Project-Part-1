package com.upgrad.HireWheels1;

import com.upgrad.HireWheels1.dao.RoleDAO;
import com.upgrad.HireWheels1.dao.UsersDAO;
import com.upgrad.HireWheels1.entities.Role;
import com.upgrad.HireWheels1.entities.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        UsersDAO usersDAO  = (UsersDAO) context.getBean("usersDAO");

        Users users1 = usersDAO.save(new Users(1,"Admin","Admin","admin@123","upgrad@gmail.com","9999999999",2,10000));

         RoleDAO roleDAO  = (RoleDAO) context.getBean("roleDAO");
        Role role1 = roleDAO.save(new Role(1,"Admin"));



    }
}
