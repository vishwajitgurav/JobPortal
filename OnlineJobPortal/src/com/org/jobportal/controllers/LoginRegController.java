package com.org.jobportal.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.org.jobportal.entities.User;
import com.org.jobportal.models.Login;
import com.org.jobportal.services.UserService;

@Controller
public class LoginRegController 
{

	@Autowired
	private UserService userService;
	
	@GetMapping("/Login")
	public ModelAndView showLoginPage() {
		
		return new ModelAndView("Login","command",new Login());
	}
	
	
	@PostMapping("/verifylogin")
	public ModelAndView validateUser(Login login, HttpSession session) throws Exception {
		User user=userService.validateUser(login);
		if(user!=null && user.getRole().equals("Company"))
		{
			session.setAttribute("userSession", user);
			return new ModelAndView("Company","user",user);
		}
		else if (user!=null && user.getRole().equals("Employee"))
		{
			session.setAttribute("userEmpSession", user);
			return new ModelAndView("Employee","user",user);
		}
		else
			return new ModelAndView("Login","user","Login Failed");
	}
	
	@GetMapping("/RegisterCompany")
	public String showCompanyRegisterPage() {
		
		return "RegisterCompany";
	}
	
	@GetMapping("/RegisterEmployee")
	public String showEmployeeRegisterPage() {
		
		return "RegisterEmployee";
	}
	
	@PostMapping("/registeremployee")
	public ModelAndView registerEmployee(User user) throws Exception
	{
		int res = userService.registerEmployee(user);
		if(res!=0)
		{
			return new ModelAndView("RegisterEmployee","user","Registration Successful");
		}
		else
			return new ModelAndView("RegisterEmployee","user","Registration Failed");
	}
	
	@PostMapping("/registercompany")
	public ModelAndView registerCompany(User user) throws Exception
	{
		int res = userService.registerCompany(user);
		if(res!=0)
		{
			return new ModelAndView("RegisterCompany","user","Registration Successful");
		}
		else
			return new ModelAndView("RegisterCompany","user","Registration Failed");
	}
	
	//For Admin  Login 
	@GetMapping("/user")
	public List<User> allUser() throws Exception 
	{
		return userService.getAllUser();
	}
}
