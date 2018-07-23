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
@Table(name="company_reg_details")
public class CompanyRegistration {

	
	@Id
	@Column
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	//@GeneratedValue(generator = "generator")
	private int company_id;
	@Column
	private String companyname;
	
	@Column
	private String companytype;
	
	@Column
	private String industry;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	User user;

	public CompanyRegistration()
	{
		this(0,"","","");
	}
	
	public CompanyRegistration(int company_id, String companyname, String companytype, String industry) {
		super();
		this.company_id = company_id;
		this.companyname = companyname;
		this.companytype = companytype;
		this.industry = industry;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanytype() {
		return companytype;
	}

	public void setCompanytype(String companytype) {
		this.companytype = companytype;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CompanyRegistration [company_id=" + company_id + ", companyname=" + companyname + ", companytype="
				+ companytype + ", industry=" + industry + "]";
	}
}
