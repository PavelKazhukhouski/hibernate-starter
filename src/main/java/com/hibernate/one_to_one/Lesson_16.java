package com.hibernate.one_to_one;

import com.hibernate.one_to_one.entity.Car;
import com.hibernate.one_to_one.entity.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lesson_16 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Engine.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Car car = Car.builder()
                    .name("Honda")
                    .year(2022)
                    .color("white")
                    .price(25000)
                    .speed(235.7)
                    .build();

            Engine engine = Engine.builder()
                    .horsePower(800)
                    .volume(5000)
                    .build();

            

            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
