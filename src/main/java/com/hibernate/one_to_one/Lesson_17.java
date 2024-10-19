package com.hibernate.one_to_one;

import com.hibernate.one_to_one.entity.Car;
import com.hibernate.one_to_one.entity.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lesson_17 {
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
            Engine engine = session.get(Engine.class, 10);
            System.out.println(engine.getCar());
            session.delete(engine);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
