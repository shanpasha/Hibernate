package com.model;
 
import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import jdk.jfr.Registered;


@Entity()
@Table(name="student")
@NamedQuery(name = "Select_all", query = "from Student")


@NamedNativeQuery(name = "select_from_stu", query = "select*from student" ,resultClass = Student.class)


public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	@Column(name="name")
 	String name;
	@Column(name="fee")
	double fee; 
	@Column(name="location")
	String location;
	@Column(name="email")
	String email;
	
//	@Column(name="mobile")
//	String mobile;
	public Student(int id, String name, double fee, String location, String email) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.location = location;
		this.email = email;
	}
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", location=" + location + ", email=" + email
				+ "]";
	}
	
	
	
	
	

}
