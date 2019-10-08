package com.lnt.hr.daos;

import java.util.ArrayList;
import java.util.List;

import com.lnt.hr.entities.Employees;
import com.lnt.hr.exceptions.EmpException;

public interface EmployeeDao {
	public List<Employees> getEmpList() throws EmpException;
	public Employees getEmpDetails(int empNo) throws EmpException;
	

}
