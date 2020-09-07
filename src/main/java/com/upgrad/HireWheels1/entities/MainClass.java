package com.upgrad.HireWheels1.entities;

import com.upgrad.hirewheels.dao.UsersDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels.xml");


        UsersDAO usersDAO  = (UsersDAO) context.getBean("usersDAO");
        Users user1 = usersDAO.save(new Users(47,"sravs","chandra","sravs47","sravs@47","8185021930",74,4700));




    }
}