package com.lnt.hr.daos;
/*Entity Class
exception
persistence xml
factory 
dao interface
dao class
service interface
service class
testing 
*/

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.lnt.hr.entities.Employees;
import com.lnt.hr.exceptions.EmpException;
import com.lnt.hr.factories.JpaResourceFactory;

public class EmployeeDaoImpl  implements EmployeeDao{
	private EntityManager manager;
	private EntityManagerFactory factory=null;
	
	
	public EmployeeDaoImpl() {
		factory=JpaResourceFactory.getFactory();		
		manager=factory.createEntityManager();
	}


	@Override
	public List<Employees> getEmpList() throws EmpException {
		Query qry=manager.createQuery("from Employees");

		List<Employees> empList =qry.getResultList();
		
		return empList;
	}
	
	@Override
	protected void finalize() throws Throwable {
		factory.close();
		super.finalize();
	}


	@Override
	public Employees getEmpDetails(int empNo) throws EmpException {
		// TODO Auto-generated method stub
		Employees emp= manager.find(Employees.class,empNo);
		return emp;
	}
	

}
