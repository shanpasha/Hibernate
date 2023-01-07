
package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
;

public class UpdateEmp {
	public static void main(String[] args) {
		
		Employee emp=new Employee(1, "ramya", 25000, "ramya@gmail.com");
		Configuration configuration=new Configuration();
		configuration.configure("/Hibernate.config.xml");
		SessionFactory sFactory=configuration.buildSessionFactory();
	Session session=sFactory.openSession();
	session.update(emp);
	session.beginTransaction().commit();
	session.close();
	
		
	
	
	}

}
