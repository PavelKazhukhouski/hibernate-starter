package com.hibernate;

import com.hibernate.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class lesson_9 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Car car = session.get(Car.class, 3);
//            car.setName("Honda");
            session.createQuery("update Car set color = 'black' " +
                    "where color = 'red'").executeUpdate();

            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
}
