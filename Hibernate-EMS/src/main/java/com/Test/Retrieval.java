package com.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.SessionUtill.SessionUtill;
import com.model.Employee;


public class Retrieval {
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
		SQLQuery query=session.createSQLQuery("SELECT*from employee e inner join address a on a.Address_id=e.employeeID");
		
		List<Object[]> employees=query.list();
		
		
		for (Object[] objects : employees) {
			
			
			System.out.println();
			

			System.out.println(objects[3]);
			System.out.println(objects[4]); 
			System.out.println(objects[5]);
			
		}
		
	
		}
		
			
		

	}

