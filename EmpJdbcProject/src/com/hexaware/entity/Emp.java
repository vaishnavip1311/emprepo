package com.hexaware.entity;

public class Emp {
	
	private int empId;
	private String empName;
	private double empSal;
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	
	
}
