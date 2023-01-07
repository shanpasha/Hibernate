package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EmployeeID")
	int EmployeeID;
	
	@Column(name="EmployeeName")
	String EmployeeName;
	
	@Column(name="salary")
	double salary;
	
	@JoinColumn(name="addressID")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	Address address;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="departmentID")
    Department department;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY) 
	@JoinTable(name="Employee_Project_table", joinColumns=@JoinColumn(name="EmployeeID"),
	inverseJoinColumns = @JoinColumn(name="projrctID"))
    List<Project>project;
	
	public Employee() {
		
	}

	public Employee(int employeeID, String employeeName, double salary, Address address, Department department,
			List<Project> project) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		this.salary = salary;
		this.address = address;
		this.department = department;
		this.project = project;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", salary=" + salary
				+ ", address=" + address + ", department=" + department + ", project=" + project + "]";
	}
	
	
	
	
	

}
