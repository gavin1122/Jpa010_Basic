package com.lnt.hr.services;

import java.util.List;

import com.lnt.hr.entities.Employees;
import com.lnt.hr.exceptions.EmpException;

public interface EmployeeService {
	public List<Employees> getEmpList() throws EmpException;

}
