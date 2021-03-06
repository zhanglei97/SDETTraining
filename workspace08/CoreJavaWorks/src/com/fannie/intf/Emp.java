package com.fannie.intf;


public class Emp implements Comparable<Emp>{
	private int empID;
	private String empName;
	private double empSal;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public Emp(int empID, String empName, double empSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Emp(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		//return this.empID-o.empID;
		return this.empName.compareTo(o.empName);
		//return o.empName.compareTo(this.empName);
	}
	
	
}
