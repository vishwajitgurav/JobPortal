package com.org.jobportal.models;


public class CompanyRegDetails {
	
	private int company_id;
	
	private String companyname;
	
	private String companytype;
	
	private String industry;
	
	public String address;
	
	public String city;

	public int pincode;
	
	public String state;

	public String country;
	
	
	public CompanyRegDetails()
	{
		this(0,"","","","","",0,"","");
	}

	public CompanyRegDetails(int company_id, String companyname, String companytype, String industry, String address,
			String city, int pincode, String state, String country) {
		super();
		this.company_id = company_id;
		this.companyname = companyname;
		this.companytype = companytype;
		this.industry = industry;
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

	@Override
	public String toString() {
		return "CompanyRegDetails [company_id=" + company_id + ", companyname=" + companyname + ", companytype="
				+ companytype + ", industry=" + industry + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + ", country=" + country + "]";
	}
}
