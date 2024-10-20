package com.hibernate.lessons.one_to_many_1;


import com.hibernate.lessons.first_lessons.lesson_1.entity.Car;
import com.hibernate.lessons.one_to_many_1.entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Owner.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Owner owner = new Owner("Katia", 23);
//            Car car1 = new Car("Fiat", 150);
//            Car car2 = new Car("Siat", 160);
//            owner.addCarToOwner(car1);
//            owner.addCarToOwner(car2);
//            session.save(owner);

//            Car car = session.get(Car.class, 19);
//            session.delete(car);

            Owner owner = session.get(Owner.class,8);
            session.delete(owner);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
