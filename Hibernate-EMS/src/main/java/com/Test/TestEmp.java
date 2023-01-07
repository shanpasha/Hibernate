package com.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.SessionUtill.SessionUtill;
import com.model.Address;
import com.model.Department;
import com.model.Employee;
import com.model.Project;

public class TestEmp {
	public static void main(String[] args) {
		
	Session session=SessionUtill.getSession();
	
	Address address=new Address();
	address.setCity("Hyderabad");
	address.setDist("Karimnagar");
    address.setCountry("india");
    address.setState("telangana");
    
    Department department=new Department();
    department.setDepartmentName("java Developer");
    
    List<Project>project=new ArrayList<Project>();
    
    Project project1=new Project();
    Project project2=new Project();
    project1.setProjectName("CPA");
    //project2.setProjectName("EMS");
    
    project.add(project1);
    project.add(project2);
   
  
   
    
    Employee employee=new Employee();
    employee.setAddress(address);
    employee.setDepartment(department);
    employee.setProject(project);
    employee.setSalary(85000.0);
    employee.setEmployeeName("Sriman");
    
    session.save(employee);
    session.beginTransaction().commit();
    
    session.close();
    
    
    
		
	}

}
