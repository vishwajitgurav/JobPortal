package com.org.jobportal.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.jobportal.entities.EmpAcademic;
import com.org.jobportal.entities.EmpAddress;
import com.org.jobportal.entities.EmpJob;
import com.org.jobportal.entities.EmpPersonal;

@Repository
public class EmployeeDetailsDao 
{
	@Autowired
	private SessionFactory factory;
	
	
	public int addEmployeePersonal(EmpPersonal personal) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(personal);
	}

	public int addEmployeeAddress(EmpAddress address) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(address);
	}
	
	public int addEmployeeAcademic(EmpAcademic academic) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(academic);
	}
	
	public int addEmployeeJob(EmpJob job) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(job);
	}
	
	public List<Object[]> companyJobList()
	{	
		Session session = factory.getCurrentSession();
		String hql="select j.jobpost_id,c.companyname,c.companytype,c.industry,j.location,j.positionofjob,j.experience,"
		+ "j.salary,j.vacancy,j.qualification,j.tech1,j.tech2,j.tech3,j.tech4"
		+ " from company_reg_details c left outer join company_jobpost_details j on j.company_id=c.company_id";
		
		NativeQuery q=session.createSQLQuery(hql);
		return (List<Object[]>)q.getResultList();
	}
	public EmpAddress getEmpaddress(int id)
	{
		Session session = factory.getCurrentSession();
		String hql="from EmpAddress where user_id=:id";
		Query q=session.createQuery(hql);
		q.setParameter("id",id);
		EmpAddress empAddress= (EmpAddress)q.getSingleResult();
		System.out.println(empAddress);
		return empAddress;
	}
	public EmpPersonal getEmpPersonal(int id)
	{
		Session session = factory.getCurrentSession();
		String hql="from EmpPersonal where user_id=:id";
		Query q=session.createQuery(hql);
		q.setParameter("id",id);
		EmpPersonal empPersonal= (EmpPersonal)q.getSingleResult();
		System.out.println(empPersonal);
		return empPersonal;
	}
	public EmpAcademic getEmpAcademic(int id)
	{
		Session session = factory.getCurrentSession();
		String hql="from EmpAcademic where user_id=:id";
		Query q=session.createQuery(hql);
		q.setParameter("id",id);
		EmpAcademic empAcademic=(EmpAcademic) q.getSingleResult();
		System.out.println(empAcademic);
		return empAcademic;
	}
	public EmpJob getEmpJob(int id)
	{
		Session session = factory.getCurrentSession();
		String hql="from EmpJob where user_id=:id";
		Query q=session.createQuery(hql);
		q.setParameter("id",id);
		EmpJob empJob=(EmpJob) q.getSingleResult();
		System.out.println(empJob);
		return empJob;
	}
	public List<Object[]> getAppliedJobList(int id)
	{
		
		Session session = factory.getCurrentSession();
		String sql="select j.jobpost_id, c.companyname, c.companytype,c.industry,j.location,j.positionofjob,"
			+ "j.experience,j.salary,j.vacancy,j.qualification,j.tech1,j.tech2,j.tech3,j.tech4 "
			+ "from company_reg_details c left outer join company_jobpost_details j on j.company_id=c.company_id "
			+ "left outer join application_details ad on ad.jobpost_id=j.jobpost_id where ad.user_id=:id";
		NativeQuery q=session.createSQLQuery(sql);
		q.setParameter("id",id);
		return (List<Object[]>)q.getResultList();
	}
}
