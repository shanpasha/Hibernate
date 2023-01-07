package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HibernateTest {
	public static void main(String[] args) {
		
		Employee em=new Employee(1, "shan shannu", 40000,"shan.createiq@gmial.com");
		
		Configuration configuration=new Configuration();
		 configuration.configure("/Hibernate.config.xml");
		SessionFactory ses=configuration.buildSessionFactory();
		Session ss=ses.openSession();
		ss.save(em);
		
		
		ss.beginTransaction().commit();
		
		ss.close();
	}

}
