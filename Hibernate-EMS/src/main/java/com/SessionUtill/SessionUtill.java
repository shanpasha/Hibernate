package com.SessionUtill;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class SessionUtill {
public static	SessionFactory sf=null;

	static {
		Configuration config=new Configuration();
		config.configure("HibernateMapping.xml");
		ServiceRegistryBuilder srb=new ServiceRegistryBuilder();
		srb.applySettings(config.getProperties());
		ServiceRegistry sr=srb.buildServiceRegistry();
		sf=config.buildSessionFactory(sr);
	
		
		
	}
	public static Session getSession() {
		return sf.openSession();
		
	}
	
	public static void main(String[] args) {
		 
		Session session=getSession();
		
	}
}
