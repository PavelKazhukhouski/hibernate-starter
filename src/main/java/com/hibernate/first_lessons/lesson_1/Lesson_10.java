package com.hibernate.first_lessons.lesson_1;

import com.hibernate.first_lessons.lesson_1.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Lesson_10 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Car car = session.get(Car.class, 6);
//            session.delete(car);

            session.createQuery("delete Car where color = 'black' ").executeUpdate();

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
