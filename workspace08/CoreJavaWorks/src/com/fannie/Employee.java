package com.fannie.bean;

public class Employee {
	public Employee(){};
	
	private int empId ;
	private String empName;
	private double empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if (empName.length()<=5) {
			this.empName="no Name";
		}
		else{
		this.empName = empName;
		}
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		if (empSal>10000){
			this.empSal = empSal;
		}else{
			this.empSal=10000;
			System.out.println("wrong number, set to 10000");
		}
	}
	
	@Override
	public String toString(){
		return this.empId+", "+this.empName +", "+this.empSal;
	}
	
}
