package com.hibernate.lesson2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2, "Mersedes", 2022, "red", 150_000, 240.0);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
        
    }
}
