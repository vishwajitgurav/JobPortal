package com.org.jobportal.models;


public class CompanyJobList {

	private int jobpost_id;
	
	private String companyname;
	
	private String companytype;
	
	private String industry;
	
	private String tech1;

	private String tech2;
	
	private String tech3;
	
	private String tech4;
	
	private String qualification;
	
	private String positionofjob;
	
	private int experience;	

	private double salary;
	
	private String location;

	private int vacancy;
	
	public CompanyJobList() {
		this(0,"","","","","","","","","",0,0.0,"",0);
	}

	public CompanyJobList(int jobpost_id,String companyname, String companytype, String industry, String tech1, String tech2,
			String tech3, String tech4, String qualification, String positionofjob, int experience, double salary,
			String location, int vacancy) {
		super();
		this.jobpost_id=jobpost_id;
		this.companyname = companyname;
		this.companytype = companytype;
		this.industry = industry;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	@Override
	public String toString() {
		return "CompanyJobList [jobpost_id=" + jobpost_id + ", companyname=" + companyname + ", companytype="
				+ companytype + ", industry=" + industry + ", tech1=" + tech1 + ", tech2=" + tech2 + ", tech3=" + tech3
				+ ", tech4=" + tech4 + ", qualification=" + qualification + ", positionofjob=" + positionofjob
				+ ", experience=" + experience + ", salary=" + salary + ", location=" + location + ", vacancy="
				+ vacancy + "]";
	}


}
