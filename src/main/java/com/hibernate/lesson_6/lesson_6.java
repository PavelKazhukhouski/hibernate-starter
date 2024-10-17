package com.hibernate.lesson_6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class lesson_6 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Car car = session.get(Car.class, 2);
            System.out.println(car);
            car.setSpeed(330);
            car.setName("BMW");
            System.out.println(car);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
