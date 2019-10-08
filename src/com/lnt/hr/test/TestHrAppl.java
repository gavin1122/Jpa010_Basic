package com.lnt.hr.test;

import java.util.List;

import com.lnt.hr.entities.Employees;
import com.lnt.hr.exceptions.EmpException;
import com.lnt.hr.services.EmployeeService;
import com.lnt.hr.services.EmployeeServiceImpl;

public class TestHrAppl {

	public static void main(String[] args) 
	{
		EmployeeService service=new EmployeeServiceImpl() ;
		try {
			/*List<Employees>  empList=service.getEmpList();
			for(Employees emp: empList) {
				System.out.println(emp);
			}*/
			Employees emp=service.getEmpDetails(105);
			System.out.println(emp);
			
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		

	}

}
