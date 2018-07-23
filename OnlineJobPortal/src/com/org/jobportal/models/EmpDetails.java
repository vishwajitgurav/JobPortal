package com.org.jobportal.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


public class EmpDetails 
{	
	private String firstname;
	private String midname;
	private String lastname;
	private String contactnumber;
	private String gender;
	private String dob;
	private String address;
	private String city;
	private int pincode;
	private String state;

	public EmpDetails() 
	{
		this("", "", "", "", "", "", "", "", 0, "");
	}

	public EmpDetails(String firstname, String midname, String lastname, String contactnumber, String gender, String dob,
			String address, String city, int pincode, String state) {
		this.firstname = firstname;
		this.midname = midname;
		this.lastname = lastname;
		this.contactnumber = contactnumber;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidname() {
		return midname;
	}

	public void setMidname(String midname) {
		this.midname = midname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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
		return "EmpDetails [firstname=" + firstname + ", midname=" + midname + ", lastname=" + lastname
				+ ", contactnumber=" + contactnumber + ", gender=" + gender + ", dob=" + dob + ", address=" + address
				+ ", city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}
		
		
}
