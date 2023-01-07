package com.Dao;

import java.util.List;

import org.hibernate.Session;

import com.SessionUtil.SessionUtil;
import com.model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Integer save(Employee employee) {
	Session session=SessionUtil.getSession();
Integer em=	(Integer) session.save(employee);
	session.beginTransaction().commit();
	SessionUtil.close(session);
	
	
	
		return em;
	}

	@Override
	public void update(Employee employee) {
		Session session=SessionUtil.getSession();
		session.update(employee);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	
		
	}

	@Override
	public void deleteById(Integer id) {
	Session session=SessionUtil.getSession();
	Employee employee=new Employee();
	employee.setId(id);
	session.delete(employee);
	session.beginTransaction().commit();
	SessionUtil.close(session);
	
		
	}

	@Override
	public Employee findById(Integer id) {
		return (Employee) SessionUtil.getSession().get(Employee.class, id);
	
		
	}

	@Override
	public List<Employee> getAll() {
	
		return SessionUtil.getSession().createQuery("from Employee").list();
	}
	
	

}
