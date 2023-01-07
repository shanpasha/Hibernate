package com.SessionUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionUtil {
	
public static	SessionFactory ss=null;
	
	static{
		
		Configuration confg=new Configuration();
		
		confg.configure("Hibernate.config.xml");
		ServiceRegistryBuilder service=new ServiceRegistryBuilder();
		service.applySettings(confg.getProperties());
		ServiceRegistry registry=service.buildServiceRegistry();
		ss=confg.buildSessionFactory(registry);
			
		
	}
	
	public static Session getSession() {
	return ss.openSession();
	}
	
	
	public static void close(Session session) {
		
		if(session!=null) {
			
			session.close();
	
		}
	}
	
	
	
}