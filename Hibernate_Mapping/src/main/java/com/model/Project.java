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
@Table(name="project_Tab")
public class Project {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="pId")
	int pId;
	
	@Column(name="pName")
     String pName;
	
	@ManyToMany(mappedBy ="project" )
	List<Employee>employees;
	
	public Project() {
		
	}
	
	public Project(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", employees=" + employees + "]";
	}
	
     
	

}
