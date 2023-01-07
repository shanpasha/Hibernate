package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Address_ID")
	int addressID;
	@Column(name="City")
	String city;
	@Column(name=("Dist"))
	String dist;
	@Column(name="State")
	String state;
	@Column(name="Country")
	String country;
	
   @OneToOne(mappedBy = "address")
	Employee employee;
   
   public Address() {
	
}

public Address(int addressID, String city, String dist, String state, String country, Employee employee) {
	super();
	this.addressID = addressID;
	this.city = city;
	this.dist = dist;
	this.state = state;
	this.country = country;
	this.employee = employee;
}

public int getAddressID() {
	return addressID;
}

public void setAddressID(int addressID) {
	this.addressID = addressID;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDist() {
	return dist;
}

public void setDist(String dist) {
	this.dist = dist;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Address [addressID=" + addressID + ", city=" + city + ", dist=" + dist + ", state=" + state + ", country="
			+ country + ", employee=" + employee + "]";
}
   
   

	

}
