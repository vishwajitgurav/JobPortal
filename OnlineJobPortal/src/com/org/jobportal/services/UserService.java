
package com.org.jobportal.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.jobportal.daos.UserDao;
import com.org.jobportal.entities.User;
import com.org.jobportal.models.Login;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	
	@Transactional
	public  User validateUser(Login login) throws Exception
	{
		User user=userdao.getUserByEmailPassword(login.getEmail(),login.getPassword());
		if(user!=null && user.getEmail().equals(login.getEmail()) && user.getPassword().equals(login.getPassword()))
			return user;
		return null;
	}
	
	@Transactional
	public int registerEmployee(User user) throws Exception 
	{
		return userdao.addEmployee(user);
	}
	
	@Transactional
	public int registerCompany(User user) throws Exception 
	{
		return userdao.addCompany(user);
	}
	
	@Transactional
	public List<User> getAllUser() throws Exception {
		return userdao.getAllUser();
	}
	
	
}
