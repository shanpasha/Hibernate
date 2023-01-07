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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_tab")
public class Employee {
	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name="eId")
	int eId;

@Column(name="eName")
	String eName;

@Column(name="eSalary")
	double eSalary;
	
@OneToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name="aId")
	Address address;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="dId")
	Department department;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name = "Emp_Proj_Table",joinColumns = @JoinColumn(name="eId"),
	inverseJoinColumns = @JoinColumn(name="pId"))
	List<Project> project;

	public Employee(int eId, String eName, double eSalary, Address address, Department department,
			List<Project> project) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.address = address;
		this.department = department;
		this.project = project;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
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
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", address=" + address
				+ ", department=" + department + ", project=" + project + "]";
	}

	
	
	
	

}
