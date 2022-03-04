package com.lti.springDemo.JenkinsPush;

public class Emp {

	private int EmpId;
	private String EmpName;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Emp(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}
	
	
}
