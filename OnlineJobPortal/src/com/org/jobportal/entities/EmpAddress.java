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
@Table(name="employee_address_details")
public class EmpAddress 
{
	@Id
	@Column
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="user"))
	//@GeneratedValue(generator="gen")
	private int user_id;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private int pincode;
	@Column
	private String state;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
	
	
	public EmpAddress() 
	{
		this(0,"","",0,"");
	}

	public EmpAddress(int user_id, String address, String city, int pincode, String state) {
		super();
		this.user_id = user_id;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	@Override
	public String toString() {
		return "EmpAddress [user_id=" + user_id + ", address=" + address + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}
	
}
