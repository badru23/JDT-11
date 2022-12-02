package id.co.indivara.jdt11.jpacrud;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class HibernateUtil {
    public static SessionFactory createSessionFactory(){
        Configuration cfg =  new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass (Employee.class);
        SessionFactory pabrikSession = cfg.buildSessionFactory();
        return pabrikSession;
    }
}