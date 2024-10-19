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
            Car car = Car.builder()
                    .name("Subaru")
                    .year(1999)
                    .color("Blue")
                    .price(1500)
                    .speed(175)
                    .build();
            Engine engine = Engine.builder()
                    .horsePower(350)
                    .volume(300)
                    .build();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            car.setEngine(engine);
            engine.setCar(car);
            session.save(engine);

            session.getTransaction().commit();
        } finally {
            assert session != null;
            session.close();
            sessionFactory.close();
        }
    }
}
