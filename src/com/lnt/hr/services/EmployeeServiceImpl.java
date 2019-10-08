package com.lnt.hr.services;

import java.util.List;

import com.lnt.hr.daos.EmployeeDao;
import com.lnt.hr.daos.EmployeeDaoImpl;
import com.lnt.hr.entities.Employees;
import com.lnt.hr.exceptions.EmpException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
		dao=new EmployeeDaoImpl();
	}

	@Override
	public List<Employees> getEmpList() throws EmpException {
		// TODO Auto-generated method stub
		List<Employees>  empList=dao.getEmpList();
		return empList;
	}

	@Override
	public Employees getEmpDetails(int empNo) throws EmpException {
		// TODO Auto-generated method stub
		return dao.getEmpDetails(empNo);
	}

}
