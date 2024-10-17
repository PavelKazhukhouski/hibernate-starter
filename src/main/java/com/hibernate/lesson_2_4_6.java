package com.hibernate;

import com.hibernate.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class lesson_2_4_6 {
    public static void main(String[] args) {
        Car car = Car.builder()
                .color("black")
                .price(150_000)
                .speed(340.0)
                .year(2022)
                .name("BMW")
                .build();


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
