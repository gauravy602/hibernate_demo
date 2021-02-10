package com.telusko.hibernatedemo;
import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.service.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
    	an.setFname("Khushi");
    	an.setMname("Kumari");
    	an.setLname("Gupta");
    	alien telusko = new alien();
    	
    	telusko.setAid(112);
    	telusko.setColor("LAAL");
    	telusko.setName(an);
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(alien.class);// Configure is needed to set if we want to change the default name
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
        session.save(telusko);
    	tx.commit();
    	//System.out.println(telusko);
    }
}
