package com.org.jobportal.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="application_details")
public class ApplicationDetails 
{
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Id
	@Column
	private int application_id;
	
	@Column
	private int user_id;
	
	@Column
	private int jobpost_id;
	
	@Column
	private Date date;
	
	public ApplicationDetails() {
		this(0,0,0,null);
	}

	public ApplicationDetails(int application_id, int user_id, int jobpost_id, Date date) {
		super();
		this.application_id = application_id;
		this.user_id = user_id;
		this.jobpost_id = jobpost_id;
		this.date = date;
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getJobpost_id() {
		return jobpost_id;
	}

	public void setJobpost_id(int jobpost_id) {
		this.jobpost_id = jobpost_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ApplicationDetails [application_id=" + application_id + ", user_id=" + user_id + ", jobpost_id="
				+ jobpost_id + ", date=" + date + "]";
	}
			
}
