package com.org.jobportal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="company_address_details")
public class CompanyAddress 
{
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	//@GeneratedValue(generator = "generator")
	@Id
	@Column
	public int company_id;
	
	@Column
	public String address;
	
	@Column
	public String city;
	@Column
	public int pincode;
	
	@Column
	public String state;
	
	@Column
	public String country;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	User user;

	
	public CompanyAddress()
	{
		this(0,"","",0,"","");
	}

	public CompanyAddress(int company_id, String address, String city, int pincode, String state, String country) {
		super();
		this.company_id = company_id;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CompanyAddress [company_id=" + company_id + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
