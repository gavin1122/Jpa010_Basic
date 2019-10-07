package com.lnt.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employees {

	private int empId;
	private String fname;
	private float salary;
	
	@Id
	@Column(name="employee_id")
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
		
	}
	
	@Column(name="First_Name")
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Column(name="Salary")
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", fname=" + fname + ", salary=" + salary + "]";
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int empId, String fname, float salary) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.salary = salary;
	}
	
	
	
	
}
