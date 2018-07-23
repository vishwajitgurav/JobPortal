package com.org.jobportal.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.jobportal.entities.CompanyAddress;
import com.org.jobportal.entities.CompanyJobpost;
import com.org.jobportal.entities.CompanyRegistration;

@Repository
public class CompanyDetailsDao {

	@Autowired
	private SessionFactory factory;
	
	
	public int addCompanyRegistration(CompanyRegistration registration) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(registration);
	}
	
	public int addCompanyAddress(CompanyAddress address) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(address);
	}
	
	public int addCompanyJobpost(CompanyJobpost jobpost) 
	{
		Session session = factory.getCurrentSession();
		return (int) session.save(jobpost);
	}
	
	
	
	public Object[] companyDetails(int id)
	{
		String role="Company";
		Session session = factory.getCurrentSession();
		String sql="select cr.username,cr.email,crd.companyname,crd.companytype,crd.industry,cad.address,"
		+ "cad.city,cad.pincode,cad.state,cad.country "
		+ "from common_registration cr left outer join company_reg_details crd on cr.user_id=crd.company_id "
		+ "left outer join company_address_details cad on cad.company_id=crd.company_id where role=:role "
		+ "and crd.company_id=:id";
		NativeQuery q=session.createSQLQuery(sql);
		q.setParameter("id",id);
		q.setParameter("role",role);

		return (Object[])q.getSingleResult();
	}
	
	public List<CompanyJobpost> companyJobPost(int id)
	{
		
		Session session = factory.getCurrentSession();		
		String hql="from CompanyJobpost where company_id=:id";
		Query q=session.createQuery(hql);
		q.setParameter("id",id);
		return (List<CompanyJobpost>)q.getResultList();
	}
	

	public List<Object[]> usersAppliedForJob(int companyid)
	{
		Session session = factory.getCurrentSession();
		String sql="select application_details.application_id,application_details.user_id,application_details.jobpost_id,application_details.date from company_reg_details "
				+ "left outer join company_jobpost_details "
				+ "on company_reg_details.company_id=company_jobpost_details.company_id "
				+ "LEFT outer join application_details "
				+ "on company_jobpost_details.jobpost_id=application_details.jobpost_id "
				+ "where company_reg_details.company_id=:id";
		NativeQuery q=session.createSQLQuery(sql);
		q.setParameter("id",companyid);
		return (List<Object[]>)q.getResultList();
	}
	
}
