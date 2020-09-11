package com.upgrad.HireWheels1.service;


import com.upgrad.HireWheels1.dao.*;
import com.upgrad.HireWheels1.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("initServiceImpl")
public class InitServiceImpl implements  InitService{
    @Override
    public void init() {
        insertIntoRole();
        createAdmin();
        insertVehicleCategory();
        insertVehicleSubCategory();
        insertFuelType();
        insertCity();
        insertLocation();
        System.out.println("executed role");
    }

    public void insertIntoRole() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
        Role userRole = new Role("User");
        Role adminRole = new Role("Admin");
        roleDAO.save(userRole);
        roleDAO.save(adminRole);
        System.out.println("hello");
    }

    public void createAdmin() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
        UsersDAO usersDAO = (UsersDAO) context.getBean("usersDAO");
        Users admin = new Users("Admin","Admin","admin@123","upgrad@gmail.com",
                "9999999999", roleDAO.findByName("Admin"),10000.00);
        usersDAO.save(admin);
    }

    public void insertVehicleCategory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        Vehicle_categoryDAO vehicleCategoryDAO = (Vehicle_categoryDAO) context.getBean("vehicleCategoryDAO");
        Vehicle_category car = new   Vehicle_category("Car");
        Vehicle_category bike = new    Vehicle_category("Bike");
        vehicleCategoryDAO.save(car);
        vehicleCategoryDAO.save(bike);
    }

    public void insertVehicleSubCategory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        Vehicle_subcategoryDAO vehicle_subcategoryDAO = (Vehicle_subcategoryDAO)
                context.getBean("vehicle_subcategoryDAO");
        Vehicle_categoryDAO  vehicle_categoryDAO = ( Vehicle_categoryDAO) context.getBean("vehicle_categoryDAO");


        Vehicle_subcategory suv = new Vehicle_subcategory("suv", (int) 300.00,
                Vehicle_categoryDAO.findByName("Car"));
        vehicle_subcategoryDAO.save(suv);

        Vehicle_subcategory sedan = new Vehicle_subcategory("sedan", (int) 250.00,
                Vehicle_categoryDAO.findByName("Car"));
        vehicle_subcategoryDAO.save(sedan);



        Vehicle_subcategory hatchBack = new Vehicle_subcategory("HatchBack", (int) 250.00,
                Vehicle_categoryDAO.findByName("Car"));
        vehicle_subcategoryDAO.save(hatchBack);
        Vehicle_subcategory cruiser = new Vehicle_subcategory("Cruiser", (int) 200.00,
                Vehicle_categoryDAO.findByName("Bike"));
        vehicle_subcategoryDAO.save(cruiser);
        Vehicle_subcategory dirtBike = new Vehicle_subcategory("DirtBike", (int) 200.00,
                Vehicle_categoryDAO.findByName("Bike"));
        vehicle_subcategoryDAO.save(dirtBike);
        Vehicle_subcategory sportsBike = new Vehicle_subcategory("SportsBike", (int) 150.00,
                Vehicle_categoryDAO.findByName("Bike"));
        vehicle_subcategoryDAO.save(sportsBike);

    }

    public void insertFuelType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        Fuel_typeDAO fuel_typeDAO = (Fuel_typeDAO) context.getBean("fuel_typeDAO");
    Fuel_type petrol = new Fuel_type("Petrol");
        fuel_typeDAO.save(petrol);
        Fuel_type diesel = new  Fuel_type("Diesel");
        fuel_typeDAO.save(diesel);
    }


    public void insertCity() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        CityDAO cityDAO = (CityDAO) context.getBean("cityDAO");
        City city = new City("Mumbai");
        cityDAO.save(city);
    }

    public void insertLocation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("HireWheels1Beans.xml");
        CityDAO cityDAO = (CityDAO) context.getBean("cityDAO");
        LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");
        Location location1 = new Location("Worli", "Dr E Moses Rd, Worli Naka, Upper Worli",
                "400018",cityDAO.findByName("Mumbai"));
        locationDAO.save(location1);
        Location location2 = new Location("Chembur", "Optic Complex",
                "400019",cityDAO.findByName("Mumbai"));
        locationDAO.save(location2);
        Location location3 = new Location("Powai", "Hiranandani Towers",
                "400020",cityDAO.findByName("Mumbai"));
        locationDAO.save(location3);
    }








}
