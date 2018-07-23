package com.org.jobportal.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.jobportal.daos.CompanyDetailsDao;
import com.org.jobportal.entities.ApplicationDetails;
import com.org.jobportal.entities.CompanyAddress;
import com.org.jobportal.entities.CompanyJobpost;
import com.org.jobportal.entities.CompanyRegistration;
import com.org.jobportal.models.CompanyJobList;

@Service
public class CompanyDetailsService {
	
	@Autowired
	private CompanyDetailsDao detailsDao;

	
	@Transactional
	public int registerCompanyRegistration(CompanyRegistration registration) 
	{
		return detailsDao.addCompanyRegistration(registration);
	}
	
	@Transactional	
	public int registerCompanyAddress(CompanyAddress address) 
	{
		return detailsDao.addCompanyAddress(address);
	}
	
	@Transactional
	public int registerCompanyJobpost(CompanyJobpost jobpost) 
	{
		return detailsDao.addCompanyJobpost(jobpost);
	}
	
	
	
	@Transactional
	public Object[] companyDetails(int id)
	{
		
		return detailsDao.companyDetails(id);
	}
	
	@Transactional
	public List<CompanyJobpost> companyJobPost(int id)
	{
		
		return detailsDao.companyJobPost(id);
	}

	@Transactional
	public List<ApplicationDetails> userAppliedForJob(int id)
	{
		List<Object[]> jobsapplied = detailsDao.usersAppliedForJob(id);
		List<ApplicationDetails> appDetailsList=new ArrayList<>();
		
		for (Object object[] : jobsapplied) 
		{
			ApplicationDetails details = new ApplicationDetails();
			details.setApplication_id((Integer)object[0]);
			details.setUser_id((Integer)object[1]);
			details.setJobpost_id((Integer)object[2]);
			details.setDate((Date)object[3]);
			appDetailsList.add(details);
		}
		System.out.println(appDetailsList);
		return appDetailsList;	
	}

	
	
}
