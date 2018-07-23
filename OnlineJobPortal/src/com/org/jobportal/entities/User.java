package com.org.jobportal.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="common_registration")
public class User {

	@Id
	@Column
	@GenericGenerator(name="gen",strategy="native")
	@GeneratedValue(generator="gen")
	private int user_id;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String role;
	
/*	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private EmpPersonal empPersonal;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private EmpAddress empAddress;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private EmpAcademic empAcademic;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private EmpJob empJob;

	@OneToOne(mappedBy="user" ,cascade=CascadeType.ALL)
	private CompanyRegistration companyRegistration;
	
	@OneToOne(mappedBy="user" ,cascade=CascadeType.ALL)
	private CompanyAddress companyAddress;
	
	@OneToOne(mappedBy="user" ,cascade=CascadeType.ALL)
	private CompanyJobpost companyJobpost;*/
	
	
	public User()
	{
		this(0,"","","","");
	}
	public User(int user_id, String username, String email, String password, String role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	/*public User(int user_id, String username, String email, String password, String role, EmpPersonal empPersonal,
			EmpAddress empAddress, EmpAcademic empAcademic, EmpJob empJob) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.empPersonal = empPersonal;
		this.empAddress = empAddress;
		this.empAcademic = empAcademic;
		this.empJob = empJob;
	}
	
	public User(int user_id, String username, String email, String password, String role,
			CompanyRegistration companyRegistration, CompanyAddress companyAddress, CompanyJobpost companyJobpost) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.companyRegistration = companyRegistration;
		this.companyAddress = companyAddress;
		this.companyJobpost = companyJobpost;
	}
	
	public CompanyRegistration getCompanyRegistration() {
		return companyRegistration;
	}
	public void setCompanyRegistration(CompanyRegistration companyRegistration) {
		this.companyRegistration = companyRegistration;
	}
	public CompanyAddress getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(CompanyAddress companyAddress) {
		this.companyAddress = companyAddress;
	}
	public CompanyJobpost getCompanyJobpost() {
		return companyJobpost;
	}
	public void setCompanyJobpost(CompanyJobpost companyJobpost) {
		this.companyJobpost = companyJobpost;
	}
	public EmpPersonal getEmpPersonal() {
		return empPersonal;
	}
	
	public void setEmpPersonal(EmpPersonal empPersonal) {
		this.empPersonal = empPersonal;
	}
	
	public EmpJob getEmpJob() {
		return empJob;
	}
	public void setEmpJob(EmpJob empJob) {
		this.empJob = empJob;
	}
	
	public EmpAddress getEmpAddress() {
		return empAddress;
	}
	
	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}
	
	public EmpAcademic getEmpAcademic() {
		return empAcademic;
	}
	
	public void setEmpAcademic(EmpAcademic empAcademic) {
		this.empAcademic = empAcademic;
	}*/
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "CommonRegistration [user_id=" + user_id + ", username=" + username + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	}
	
}
