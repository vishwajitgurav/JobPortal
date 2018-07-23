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
@Table(name="employee_job_details")
public class EmpJob 
{
	@Id
	@Column
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="user"))
	//@GeneratedValue(generator="gen")
	private int user_id;
	@Column
	private String tech1;
	@Column
	private String tech2;
	@Column
	private String tech3;
	@Column
	private String tech4;
	@Column
	private String positionofjob;
	@Column
	private String location;
	@Column
	private double pkgexpected;
	@Column
	private int experience;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
	
	public EmpJob() 
	{
		this(0,"","","","","","",0.0,0);
	}

	public EmpJob(int user_id, String tech1, String tech2, String tech3, String tech4, String positionofjob,
			String location, double pkgexpected, int experience) {
		super();
		this.user_id = user_id;
		this.tech1 = tech1;
		this.tech2 = tech2;
		this.tech3 = tech3;
		this.tech4 = tech4;
		this.positionofjob = positionofjob;
		this.location = location;
		this.pkgexpected = pkgexpected;
		this.experience = experience;
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

	public String getPositionofjob() {
		return positionofjob;
	}

	public void setPositionofjob(String positionofjob) {
		this.positionofjob = positionofjob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPkgexpected() {
		return pkgexpected;
	}

	public void setPkgexpected(double pkgexpected) {
		this.pkgexpected = pkgexpected;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmpJob [user_id=" + user_id + ", tech1=" + tech1 + ", tech2=" + tech2 + ", tech3=" + tech3 + ", tech4="
				+ tech4 + ", positionofjob=" + positionofjob + ", location=" + location + ", pkgexpected=" + pkgexpected
				+ ", experience=" + experience + "]";
	}
	
	
	
	
	
}
