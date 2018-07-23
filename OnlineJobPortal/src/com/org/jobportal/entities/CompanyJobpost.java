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
@Table(name="company_jobpost_details")
public class CompanyJobpost {
	
	//@GeneratedValue(generator = "generator")
	@Id
	@Column
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	private int jobpost_id;
	
	@Column
	private int company_id;
	
	@Column
	private String tech1;
	
	@Column
	private String tech2;
	
	@Column
	private String tech3;
	
	@Column
	private String tech4;
	
	@Column
	private String qualification;
	
	@Column
	private String positionofjob;
	
	@Column
	private int experience;	
	
	@Column
	private double salary;
	
	@Column
	private String location;
	
	@Column
	private int vacancy;	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	CompanyRegistration user;


	public CompanyJobpost()
	{
		this(0,0,"","","","","","",0,0.0,"",0);
	}

	

	public CompanyJobpost(int jobpost_id, int company_id, String tech1, String tech2, String tech3, String tech4,
			String qualification, String positionofjob, int experience, double salary, String location, int vacancy) {
		super();
		this.jobpost_id = jobpost_id;
		this.company_id = company_id;
		this.tech1 = tech1;
		this.tech2 = tech2;
		this.tech3 = tech3;
		this.tech4 = tech4;
		this.qualification = qualification;
		this.positionofjob = positionofjob;
		this.experience = experience;
		this.salary = salary;
		this.location = location;
		this.vacancy = vacancy;
	}



	public int getJobpost_id() {
		return jobpost_id;
	}

	public void setJobpost_id(int jobpost_id) {
		this.jobpost_id = jobpost_id;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getTech1() {
		return tech1;
	}

	public void setTech1(String tech1) {
		this.tech1 = tech1;
	}

	public String getTech2() {
		return tech2;
	}

	public void setTech2(String tech2) {
		this.tech2 = tech2;
	}

	public String getTech3() {
		return tech3;
	}

	public void setTech3(String tech3) {
		this.tech3 = tech3;
	}

	public String getTech4() {
		return tech4;
	}

	public void setTech4(String tech4) {
		this.tech4 = tech4;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPositionofjob() {
		return positionofjob;
	}

	public void setPositionofjob(String positionofjob) {
		this.positionofjob = positionofjob;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getVacancy() {
		return vacancy;
	}

	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/



	@Override
	public String toString() {
		return "CompanyJobpost [jobpost_id=" + jobpost_id + ", company_id=" + company_id + ", tech1=" + tech1
				+ ", tech2=" + tech2 + ", tech3=" + tech3 + ", tech4=" + tech4 + ", qualification=" + qualification
				+ ", positionofjob=" + positionofjob + ", experience=" + experience + ", salary=" + salary
				+ ", location=" + location + ", vacancy=" + vacancy + "]";
	}

	
	
	
	
}
