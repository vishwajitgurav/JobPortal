package com.org.jobportal.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.jobportal.entities.EmpAcademic;
import com.org.jobportal.entities.EmpAddress;
import com.org.jobportal.entities.EmpJob;
import com.org.jobportal.entities.EmpPersonal;
import com.org.jobportal.entities.User;
import com.org.jobportal.models.CompanyJobList;
import com.org.jobportal.models.EmpDetails;
import com.org.jobportal.services.EmployeeDetailsService;

@Controller
public class EmployeeDetailsController 
{
	@Autowired
	private EmployeeDetailsService detailsService;
	
	
	@GetMapping("/fillempDetails")
	public String getEmpPersonal()
	{
		return "EmpDetails";
	}
	
	
	
	@GetMapping("/fillEmpAcademic")
	public String getEmpAcademic()
	{
		return "EmpAcademic";
	}
	
	@GetMapping("/fillEmpJob")
	public String getEmpJob()
	{
		return "EmpJob";
	}
	
	@GetMapping("/empprofile")
	public ModelAndView showMyProfile(HttpSession session)
	{
		System.out.println("inside controller");
		User user=(User)session.getAttribute("userEmpSession");
		System.out.println(user.getUser_id());
		Map<String, Object> mapmodel=detailsService.getAllEmpDetails(user.getUser_id());
		return new ModelAndView("EmployeeProfile","mapmodel",mapmodel);
	}
	
	@PostMapping("/registeremployeedetails")
	public String registerEmployeeDetails(EmpDetails details, HttpSession session)
	{
		System.out.println(details);
		EmpPersonal personal = new EmpPersonal();
			personal.setFirstname(details.getFirstname());
			personal.setMidname(details.getMidname());
			personal.setLastname(details.getLastname());
			personal.setGender(details.getGender());
			personal.setDob(details.getDob());
			personal.setContactnumber(details.getContactnumber());
		    EmpAddress address = new EmpAddress();
			address.setAddress(details.getAddress());
			address.setCity(details.getCity());
			address.setPincode(details.getPincode());
			address.setState(details.getState());
		User user  = (User)session.getAttribute("userEmpSession");
		System.out.println(user);
		System.out.println(personal);
		personal.setUser_id(user.getUser_id());
		address.setUser_id(user.getUser_id());
		int res = detailsService.registerEmployeePersonal(personal);
		int res1 = detailsService.registerEmployeeAddress(address);
		if(res!=0)
		{
			return "Employee";
		}
		else
			return "EmpDetails";
	}
	
	
	
	@PostMapping("/registeremployeeacademic")
	public String registerEmployeeAcademic(EmpAcademic academic,HttpSession session)
	{
		User user=(User)session.getAttribute("userEmpSession");
		academic.setUser_id(user.getUser_id());
		int res = detailsService.registerEmployeeAcademic(academic);
		if(res!=0)
		{
			return "Employee";
		}
		else
			return "EmpAcademic";
	}
	
	@PostMapping("/registeremployeejob")
	public String registerEmployeeJob(EmpJob job,HttpSession session)
	{
		User user=(User)session.getAttribute("userEmpSession");
		job.setUser_id(user.getUser_id());
		int res = detailsService.registerEmployeeJob(job);
		if(res!=0)
		{
			return "Employee";
		}
		else
			return "EmpJob";
	}
		
	
	@GetMapping("/showjoblist")
	public ModelAndView showJobList()
	{
		List<Object[]> joblist=detailsService.companyJobList();
		List<CompanyJobList> companyJobList=new ArrayList<>();
		for (Object object[] : joblist) 
		{
			CompanyJobList companyJobList2=new CompanyJobList();
			companyJobList2.setJobpost_id((Integer)object[0]);
			companyJobList2.setCompanyname((String)object[1]);
			companyJobList2.setCompanytype((String)object[2]);
			companyJobList2.setIndustry((String)object[3]);
			companyJobList2.setLocation((String)object[4]);
			companyJobList2.setPositionofjob((String)object[5]);
			companyJobList2.setExperience((Integer)object[6]);
			companyJobList2.setSalary((Double)object[7]);
			companyJobList2.setVacancy((Integer)object[8]);
			companyJobList2.setQualification((String)object[9]);
			companyJobList2.setTech1((String)object[10]);
			companyJobList2.setTech2((String)object[11]);
			companyJobList2.setTech3((String)object[12]);
			companyJobList2.setTech4((String)object[13]);
			companyJobList.add(companyJobList2);
			System.out.println(companyJobList2);
		}
		return new ModelAndView("ShowAllJobList","joblist",companyJobList);
		
	}
	
	@GetMapping("/showappliedjobs")
	public ModelAndView getAppliedJobs(HttpSession session)
	{
		User user=(User)session.getAttribute("userEmpSession");
		
		List<Object[]> joblist=detailsService.getAppliedJobs(user.getUser_id());
		List<CompanyJobList> appliedJobList=new ArrayList<>();
		for (Object object[] : joblist) 
		{
			CompanyJobList companyJobList2=new CompanyJobList();
			companyJobList2.setJobpost_id((Integer)object[0]);
			companyJobList2.setCompanyname((String)object[1]);
			companyJobList2.setCompanytype((String)object[2]);
			companyJobList2.setIndustry((String)object[3]);
			companyJobList2.setLocation((String)object[4]);
			companyJobList2.setPositionofjob((String)object[5]);
			companyJobList2.setExperience((Integer)object[6]);
			companyJobList2.setSalary((Double)object[7]);
			companyJobList2.setVacancy((Integer)object[8]);
			companyJobList2.setQualification((String)object[9]);
			companyJobList2.setTech1((String)object[10]);
			companyJobList2.setTech2((String)object[11]);
			companyJobList2.setTech3((String)object[12]);
			companyJobList2.setTech4((String)object[13]);
			appliedJobList.add(companyJobList2);
			System.out.println(companyJobList2);
		}
		return new ModelAndView("EmpAppliedJobs","appliedjoblist",appliedJobList);
	}
	
	
	
}
