/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

import ExThree.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 *
 * @author Hungg
 */
public class MainFindProduct {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {

            session.beginTransaction();

            List<Product> products = session
                    .createQuery("FROM Product p WHERE p.price > 1000", Product.class)
                    .getResultList();

            for (Product p : products) {
                System.out.println(p.getName() + " - " + p.getPrice());
            }

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
