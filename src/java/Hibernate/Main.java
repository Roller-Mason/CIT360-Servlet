/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mason
 */
public class Main {
    
    public static void main(String[] args) {
        Transaction tx = null;

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        User user = new User();
        user.setUserName("TestingUser");
        user.setPassword("TestPassword1");
        user.setEmploymentStatus(1);
        user.setEmployeeId(215);

        try{
            tx = session.beginTransaction();
            session.save(user);
            System.out.println("User was added to the database.");
            tx.commit();
            session.close();
            factory.close();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace(); 
        } finally {
            session.close(); 
        }
    }
    
}
