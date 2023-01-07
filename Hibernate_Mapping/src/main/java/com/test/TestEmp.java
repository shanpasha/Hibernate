package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.SessionUtil.SessionUtill;
import com.model.Address;
import com.model.Department;
import com.model.Employee;
import com.model.Project;

public class TestEmp {
	public static void main(String[] args) {
		
		
		Session session=SessionUtill.getSession();
		
	
	Employee employee=new Employee();
	employee.seteName("Sriman");
	employee.seteSalary(120000.0);
		
	Address address=new Address();
	address.setCity("karimnagr");
	address.setTown("Manthani");
	address.setState("telangana");
    address.setDist("karimnagar");
    address.setCountry("india");
     
	Department department=new Department();
	department.setdName("java Developer");
	
	List<Project>project=new ArrayList<Project>();
	Project project2=new Project();
	project2.setpName("CPA");
	project.add(project2);
	
	employee.setDepartment(department);
	employee.setAddress(address);
	employee.setProject(project);
	
			session.save(employee);
	
	
	
		
		
		
		
	session.beginTransaction().commit();
	
	
	
	session.close();
	
		
	}

}
