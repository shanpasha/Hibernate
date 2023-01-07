package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Column(name="DepartmentID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int departmentID;
	
	@Column(name="department_Name")
	String departmentName; 
	
	@OneToMany(mappedBy = "department")
	List<Employee>employees;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentID, String departmentName, List<Employee> employees) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}
	
	
	
	

}
