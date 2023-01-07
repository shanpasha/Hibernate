package com.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address_tab")
public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="aId")
    int aId;	
	@Column(name="city")
   String city;
	@Column(name="town")
   String town;
	@Column(name="dist")
   String dist;
	@Column(name="state")
   String state;
	@Column(name="country")
   String country;
	
	@OneToOne(mappedBy ="address")
	Employee employees;
	
	public Address() {
		
	}

	public Address(int aId, String city, String town, String dist, String state, String country, Employee employees) {
		super();
		this.aId = aId;
		this.city = city;
		this.town = town;
		this.dist = dist;
		this.state = state;
		this.country = country;
		this.employees = employees;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
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

	public Employee getEmployees() {
		return employees;
	}

	public void setEmployees(Employee employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", town=" + town + ", dist=" + dist + ", state=" + state
				+ ", country=" + country + ", employees=" + employees + "]";
	}

	
	
	

	
}
