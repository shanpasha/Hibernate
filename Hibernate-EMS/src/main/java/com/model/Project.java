package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Project_ID")
	int projrctID;
	
	@Column(name="Project_Name")
	String projectName;
	
	@ManyToMany(mappedBy = "project")
	List<Employee>employees;
	
public Project() {
	// TODO Auto-generated constructor stub
}
	
	public Project(int projrctID, String projectName, List<Employee> employees) {
		super();
		this.projrctID = projrctID;
		this.projectName = projectName;
		this.employees = employees;
	}
	
	public int getProjrctID() {
		return projrctID;
	}
	public void setProjrctID(int projrctID) {
		this.projrctID = projrctID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [projrctID=" + projrctID + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
	

}
