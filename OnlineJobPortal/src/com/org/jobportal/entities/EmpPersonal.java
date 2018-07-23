package com.org.jobportal.entities;

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

@Entity
@Table(name="employee_personal_details")
public class EmpPersonal 
{
	@Id
	@Column
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="user"))
	//@GeneratedValue(generator="gen")
	private int user_id;
	@Column
	private String firstname;
	@Column
	private String midname;
	@Column
	private String lastname;
	@Column
	private String contactnumber;
	@Column
	private String gender;
	@Column
	private String dob;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
	
	
	public EmpPersonal() 
	{
		this(0, "", "", "", "", "", "");
	}

	public EmpPersonal(int user_id, String firstname, String midname, String lastname, String contactnumber, String gender,
			String dob) 
	{
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.midname = midname;
		this.lastname = lastname;
		this.contactnumber = contactnumber;
		this.gender = gender;
		this.dob = dob;
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

	@Override
	public String toString() {
		return "EmpPersonal [user_id=" + user_id + ", firstname=" + firstname + ", midname=" + midname + ", lastname="
				+ lastname + ", contactnumber=" + contactnumber + ", gender=" + gender + ", dob=" + dob + "]";
	}

	
}
