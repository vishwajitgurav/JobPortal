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
@Table(name="employee_academic_details")
public class EmpAcademic 
{
	@Id
	@Column
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="user"))
	//@GeneratedValue(generator="gen")
	private int user_id;
	@Column
	private String schoolname;
	@Column
	private double sscmarks;
	@Column
	private String hscclgname;
	@Column
	private String hscstream;
	@Column
	private double hscmarks;
	@Column
	private String diplomaclgname;
	@Column
	private String diplomastream;
	@Column
	private double diplomamarks;
	@Column
	private String degreeclgname;
	@Column
	private String degreestream;
	@Column
	private double degreemarks;
	@Column
	private String degree;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
	
	public EmpAcademic() 
	{
		this(0, "", 0.0, "", "", 0.0, "", "", 0.0, "", "", 0.0, "");
	}

	public EmpAcademic(int user_id, String schoolname, double sscmarks, String hscclgname, String hscstream,
			double hscmarks, String diplomaclgname, String diplomastream, double diplomamarks, String degreeclgname,
			String degreestream, double degreemarks, String degree) {
		super();
		this.user_id = user_id;
		this.schoolname = schoolname;
		this.sscmarks = sscmarks;
		this.hscclgname = hscclgname;
		this.hscstream = hscstream;
		this.hscmarks = hscmarks;
		this.diplomaclgname = diplomaclgname;
		this.diplomastream = diplomastream;
		this.diplomamarks = diplomamarks;
		this.degreeclgname = degreeclgname;
		this.degreestream = degreestream;
		this.degreemarks = degreemarks;
		this.degree = degree;
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

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public double getSscmarks() {
		return sscmarks;
	}

	public void setSscmarks(double sscmarks) {
		this.sscmarks = sscmarks;
	}

	public String getHscclgname() {
		return hscclgname;
	}

	public void setHscclgname(String hscclgname) {
		this.hscclgname = hscclgname;
	}

	public String getHscstream() {
		return hscstream;
	}

	public void setHscstream(String hscstream) {
		this.hscstream = hscstream;
	}

	public double getHscmarks() {
		return hscmarks;
	}

	public void setHscmarks(double hscmarks) {
		this.hscmarks = hscmarks;
	}

	public String getDiplomaclgname() {
		return diplomaclgname;
	}

	public void setDiplomaclgname(String diplomaclgname) {
		this.diplomaclgname = diplomaclgname;
	}

	public String getDiplomastream() {
		return diplomastream;
	}

	public void setDiplomastream(String diplomastream) {
		this.diplomastream = diplomastream;
	}

	public double getDiplomamarks() {
		return diplomamarks;
	}

	public void setDiplomamarks(double diplomamarks) {
		this.diplomamarks = diplomamarks;
	}

	public String getDegreeclgname() {
		return degreeclgname;
	}

	public void setDegreeclgname(String degreeclgname) {
		this.degreeclgname = degreeclgname;
	}

	public String getDegreestream() {
		return degreestream;
	}

	public void setDegreestream(String degreestream) {
		this.degreestream = degreestream;
	}

	public double getDegreemarks() {
		return degreemarks;
	}

	public void setDegreemarks(double degreemarks) {
		this.degreemarks = degreemarks;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "EmpAcademic [user_id=" + user_id + ", schoolname=" + schoolname + ", sscmarks=" + sscmarks
				+ ", hscclgname=" + hscclgname + ", hscstream=" + hscstream + ", hscmarks=" + hscmarks
				+ ", diplomaclgname=" + diplomaclgname + ", diplomastream=" + diplomastream + ", diplomamarks="
				+ diplomamarks + ", degreeclgname=" + degreeclgname + ", degreestream=" + degreestream
				+ ", degreemarks=" + degreemarks + ", degree=" + degree + "]";
	}
		  
}
