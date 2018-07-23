package com.org.jobportal.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.jobportal.daos.EmployeeDetailsDao;
import com.org.jobportal.entities.EmpAcademic;
import com.org.jobportal.entities.EmpAddress;
import com.org.jobportal.entities.EmpJob;
import com.org.jobportal.entities.EmpPersonal;

@Service
public class EmployeeDetailsService 
{
	@Autowired
	private EmployeeDetailsDao detailsDao;
	
	@Transactional
	public int registerEmployeePersonal(EmpPersonal personal) 
	{
		return detailsDao.addEmployeePersonal(personal);
	}

	@Transactional
	public int registerEmployeeAddress(EmpAddress address) 
	{
		return detailsDao.addEmployeeAddress(address);
	}
	
	@Transactional
	public int registerEmployeeAcademic(EmpAcademic academic) 
	{
		return detailsDao.addEmployeeAcademic(academic);
	}
	
	@Transactional
	public int registerEmployeeJob(EmpJob job) 
	{
		return detailsDao.addEmployeeJob(job);
	}

	
	@Transactional
	public List<Object[]> companyJobList()
	{
		return detailsDao.companyJobList();
	}
	
	@Transactional
	public List<Object[]> getAppliedJobs(int id)
	{
		return detailsDao.getAppliedJobList(id);
	}
	
	@Transactional
	public Map<String,Object> getAllEmpDetails(int id)
	{
		System.out.println("insidev map seviuce");
		EmpPersonal empPersonal=detailsDao.getEmpPersonal(id);
		EmpAddress empAddress=detailsDao.getEmpaddress(id);
		EmpAcademic empAcademic=detailsDao.getEmpAcademic(id);
		EmpJob empJob=detailsDao.getEmpJob(id);
		Map<String, Object> mapmodel=new HashMap<>();
		mapmodel.put("empPersonal",empPersonal);
		mapmodel.put("empAddress",empAddress);
		mapmodel.put("empAcademic",empAcademic);
		mapmodel.put("empJob",empJob);
		return mapmodel;
	}
}
