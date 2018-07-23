package com.org.jobportal.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.jobportal.entities.ApplicationDetails;
import com.org.jobportal.entities.CompanyAddress;
import com.org.jobportal.entities.CompanyJobpost;
import com.org.jobportal.entities.CompanyRegistration;
import com.org.jobportal.entities.User;
import com.org.jobportal.models.CompanyDetails;
import com.org.jobportal.models.CompanyRegDetails;
import com.org.jobportal.services.CompanyDetailsService;

@Controller
public class CompanyDetailsController {
	
	@Autowired
	private CompanyDetailsService detailsService;
	
	@GetMapping("/Company")
	public String showCompany()
	{
		return "Company";
	}
	
	@GetMapping("/postJob")
	public String showPostJob()
	{
		return "CompanyJobPost";
	}
	
	@GetMapping("/fillDetails")
	public String showFillDatils()
	{
		return "CompanyDetails";
	}

	
	@PostMapping("/registercompanyjobpost")
	public ModelAndView companyJobpost(CompanyJobpost jobpost,HttpSession session)
	{
		User user  = (User)session.getAttribute("userSession");
		System.out.println(user);
		System.out.println(jobpost);
		jobpost.setCompany_id(user.getUser_id());
		int res = detailsService.registerCompanyJobpost(jobpost);
		System.out.println(res);
		if(res==0)
		{
			return new ModelAndView("Company","result","Success") ;
		}
		else
			return new ModelAndView("CompanyJobPost","result","Failure") ;
	}
	
	
	@PostMapping("/registercompanydetails")
	public ModelAndView registerCompanyRegistration(CompanyRegDetails regDetails,HttpSession session)
	{
		User user=(User)session.getAttribute("userSession");
		CompanyRegistration registration=new CompanyRegistration();
		registration.setCompany_id(user.getUser_id());
		registration.setCompanyname(regDetails.getCompanyname());
		registration.setCompanytype(regDetails.getCompanytype());
		registration.setIndustry(regDetails.getIndustry());

		
		CompanyAddress address=new CompanyAddress();
		address.setCompany_id(user.getUser_id());
		address.setAddress(regDetails.getAddress());
		address.setCity(regDetails.getCity());
		address.setPincode(regDetails.getPincode());
		address.setState(regDetails.getState());
		address.setCountry(regDetails.getCountry());
		
		int res = detailsService.registerCompanyRegistration(registration);
		int res1 = detailsService.registerCompanyAddress(address);
				
		if(res!=0 && res1!=0)
		{
			session.getAttribute("userSession");
			return new ModelAndView("CompanyJobPost");
		}
		else
		{
			session.getAttribute("userid");
			return new ModelAndView("CompanyDetails","company","Fail to submit");
		}
	}
	
	@GetMapping("/companyprofile")
	public ModelAndView showCompanyProfilepage(HttpSession session)
	{
		User user=(User)session.getAttribute("userSession");
		Object[] obj=detailsService.companyDetails(user.getUser_id());
		CompanyDetails cd=new CompanyDetails();
		cd.setUsername((String)(obj[0]));
		cd.setEmail((String)(obj[1]));
		cd.setCompanyname((String)(obj[2]));
		cd.setCompanytype((String)(obj[3]));
		cd.setIndustry((String)(obj[4]));
		cd.setAddress((String)(obj[5]));
		cd.setCity((String)(obj[6]));
		cd.setPincode((Integer)(obj[7]));
		cd.setState((String)(obj[8]));
		cd.setCountry((String)(obj[9]));
		System.out.println(cd);
		return new ModelAndView("CompanyProfile","cd",cd);
	}
	
	@GetMapping("/seepostjob")
	public ModelAndView showCompanyJobPost(HttpSession session)
	{
		User user=(User)session.getAttribute("userSession");
		List<CompanyJobpost> jobpostlist=detailsService.companyJobPost(user.getUser_id());
		for (CompanyJobpost companyJobpost : jobpostlist) {
			System.out.println(companyJobpost);
		}
		return new ModelAndView("CompanyPostedJobs","jobpostlist",jobpostlist);
	}
	

	
	
	
	@GetMapping("/companynotification")
	public ModelAndView userAppliedForJob(HttpSession session)
	{
		User user=(User)session.getAttribute("userSession");
		List<ApplicationDetails>  appliedJobList = detailsService.userAppliedForJob(user.getUser_id());
		return new ModelAndView("CompanyNotification","appliedJobList",appliedJobList);
	}
	
	
	@GetMapping("/getuserbyid")
	public ModelAndView getUserById(@RequestParam("id")int id)
	{
		System.out.println(id);
		return new ModelAndView("CompanyNotification");
	}
	
	
	
	
}
