package com.hibernate.first_lessons.lesson_1;

import com.hibernate.first_lessons.lesson_1.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Lesson_7 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Car>  cars = session.createQuery("from Car where year = 2021").getResultList();

            for (Car car : cars){
                System.out.println(car);
            }
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
