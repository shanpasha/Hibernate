package com.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Employee;

public class GetTest {
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
		
		
		List<Employee> list=session.createQuery("From Employee").list();
		session.beginTransaction().commit();
		
		for (Employee employee : list) {
			System.out.println(employee.geteId());
			
		}
		

		
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


