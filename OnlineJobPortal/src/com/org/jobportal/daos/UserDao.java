package com.org.jobportal.daos;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.jobportal.entities.User;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory factory;
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUser() throws Exception 
	{
		try 
		{
			Session session = factory.getCurrentSession();
			@SuppressWarnings("rawtypes")
			Query q = session.createQuery("from User");
			List<User> userList= q.getResultList();
			return userList;
		} catch (HibernateException e) 
		{
			throw new Exception();
		}
	}
	
	public User getUserByEmailPassword(String email,String password) throws Exception {
		Session session = factory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query q = session.createQuery("from User u where u.email=:u_email and u.password=:u_password");
		q.setParameter("u_email", email);
		q.setParameter("u_password", password);
		User user;
			try 
			{
				user = (User) q.getSingleResult();
				System.out.println(user);
				return user;
			} 
			catch (Exception e) 
			{
				throw new Exception();
			}	
	}
	
	
	public int addEmployee(User user) throws Exception 
	{
		try 
		{
			Session session = factory.getCurrentSession();
			user.setRole("Employee");
			return (int) session.save(user);
		} 
		catch (HibernateException e) {
			throw new Exception();
		}
	}
	
	public int addCompany(User user) throws Exception 
	{
		try 
		{
			Session session = factory.getCurrentSession();
			user.setRole("Company");
			return (int) session.save(user);
		} 
		catch (HibernateException e) {
			throw new Exception();
		}
	}
	
}
