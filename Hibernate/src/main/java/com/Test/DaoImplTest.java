package com.Test;

import com.Dao.EmployeeDAOImpl;
import com.model.Employee;

public class DaoImplTest {

	public static void main(String[] args) {
		
		EmployeeDAOImpl daoImpl=new EmployeeDAOImpl();
		
		//daoImpl.save(new Employee(11,"mahi",36000 , "mahi@gmail.com"));
		
//		daoImpl.save(new Employee(15,"sriman",46000 , "sriman@gmail.com"));
//		daoImpl.save(new Employee(12,"arjun",39000 , "arjun@gmail.com"));
		//daoImpl.save(new Employee(13,"akhila",27000 , "akhila@gmail.com"));
		
//		System.out.println(daoImpl.findById(11));
	//System.out.println(daoImpl.findById(15));
		//daoImpl.update(new Employee(11, "shan", 60000, "shan@gmail.com"));
		//daoImpl.deleteById(13);
		System.out.println(daoImpl.getAll());
		
		
		
		
		
	}
	
}
