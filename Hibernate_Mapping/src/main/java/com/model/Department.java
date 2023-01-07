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
@Table(name="Department_tab")
public class Department {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="dId")
	int dId;
	@Column(name="dName")
	String dName; 
	
@OneToMany(mappedBy = "department")
	List<Employee>employees;

public Department() {
	
}

public Department(int dId, String dName, List<Employee> employees) {
	super();
	this.dId = dId;
	this.dName = dName;
	this.employees = employees;
}

public int getdId() {
	return dId;
}

public void setdId(int dId) {
	this.dId = dId;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

public List<Employee> getEmployees() {
	return employees;
}

public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

@Override
public String toString() {
	return "Department [dId=" + dId + ", dName=" + dName + ", employees=" + employees + "]";
}



}
