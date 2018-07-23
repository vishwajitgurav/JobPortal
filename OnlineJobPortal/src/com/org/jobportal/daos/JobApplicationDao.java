package com.org.jobportal.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.jobportal.entities.ApplicationDetails;
import com.org.jobportal.entities.CompanyRegistration;

@Repository
public class JobApplicationDao {

	@Autowired
	private SessionFactory factory;
	
	public int addJobApplication(ApplicationDetails applicationDetails) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(applicationDetails);
	}
	

}
