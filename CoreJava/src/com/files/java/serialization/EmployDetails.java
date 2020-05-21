package com.files.java.serialization;

import java.io.Serializable;

public class EmployDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String employeeName;
	int employeeAge;
	int employeeSalary;
	
	EmployDetails(String employeeName,int employeeAge,int employeeSalary){
		this.employeeName=employeeName;
		this.employeeAge=employeeAge;
		this.employeeSalary=employeeSalary;
	}
}
