package com.Dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	
	
	public Integer save(Employee employee);
	public void update(Employee employee);
	public void deleteById(Integer id);
	public Employee findById(Integer id);	
	List<Employee>getAll();

}
