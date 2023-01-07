 package com.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.SessionUtill.SessionUtill;
import com.model.Department;
import com.model.Employee;

public class JoinHQL {
	
	public static void main(String[] args) {
		
		Session session=SessionUtill.getSession();
		
//		Query query=session.createQuery("From Department as depart inner join depart.employees as  emp");
//		
//		List<?> list=query.list();
//		for (int i = 0;i  < list.size(); i++) {
//			
//			Object[] row = (Object[]) list.get(i);
//			Department department = (Department)row[0];
//			Employee employee = (Employee)row[1];
//			System.out.println("Department:"+department.getDepartmentID()+", department:"+ department.getDepartmentName()+
//					   ", EmpId:"+ employee.getEmployeeID()+", EmpName:"+ employee.getEmployeeName());
//			
			
		
		
		
Query query=session.createQuery("From Department as depart outer join depart.employees as  emp");
		
		List<?> list=query.list();
		for (int i = 0;i  < list.size(); i++) {
			
			Object[] row = (Object[]) list.get(i);
			Department department = (Department)row[0];
			Employee employee = (Employee)row[1];
			System.out.println("Department:"+department.getDepartmentID()+", department:"+ department.getDepartmentName()+
					   ", EmpId:"+ employee.getEmployeeID()+", EmpName:"+ employee.getEmployeeName());
			
		}
		
		
		
		
	}
	

}
