package com.org.jobportal.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.jobportal.entities.ApplicationDetails;
import com.org.jobportal.entities.CompanyJobpost;
import com.org.jobportal.entities.User;
import com.org.jobportal.services.JobApplicationService;

@Controller
public class JobApplicationController {

	@Autowired
	private JobApplicationService jobservice;
	
	@GetMapping("/applyforjob")
	public ModelAndView companyJobpost(@RequestParam("id") int jobid,HttpSession session)
	{
		User user  = (User)session.getAttribute("userEmpSession");
		ApplicationDetails applicationDetails=new ApplicationDetails();
		applicationDetails.setJobpost_id(jobid);
		applicationDetails.setUser_id(user.getUser_id());
		
		int res= jobservice.addJobApplication(applicationDetails);
		System.out.println(user);
		System.out.println(res);
		if(res!=0)
		{
			return new ModelAndView("Employee","result","Apply Successful") ;
		}
		else
			return new ModelAndView("Employee","result","Apply Failed") ;
	}
	
	
	
}
