package com.org.jobportal.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.jobportal.daos.JobApplicationDao;
import com.org.jobportal.entities.ApplicationDetails;
import com.org.jobportal.entities.CompanyJobpost;

@Service
public class JobApplicationService {

	
	@Autowired
	private JobApplicationDao applicationDao;
	
	@Transactional
	public int addJobApplication(ApplicationDetails applicationDetails) 
	{
		
		return applicationDao.addJobApplication(applicationDetails);
	}

	
}
