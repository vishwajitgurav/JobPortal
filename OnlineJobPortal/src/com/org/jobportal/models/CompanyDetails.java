package com.org.jobportal.models;

public class CompanyDetails {

	private String username;
	
	private String email;
	
	private String companyname;
	
	private String companytype;
	
	private String industry;
	
	public String address;
	
	public String city;

	public int pincode;
	
	public String state;

	public String country;
	
	public CompanyDetails() {
		this("","","","","","","",0,"","");
	}
	
	
	public CompanyDetails(String username, String email, String companyname, String companytype, String industry,
			String address, String city, int pincode, String state, String country) {
		super();
		this.username = username;
		this.email = email;
		this.companyname = companyname;
		this.companytype = companytype;
		this.industry = industry;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "CompanyDetails [username=" + username + ", email=" + email + ", companyname=" + companyname
				+ ", companytype=" + companytype + ", industry=" + industry + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", state=" + state + ", country=" + country + "]";
	}

	

}
