package com.clients;

import com.fannie.Employee;

public class EmployeeClient {
	public static void main(String[] args){
		Employee emp1;
		emp1 =  new Employee();
		
		emp1.setEmpId(12345);
		emp1.setEmpName("scott");
		emp1.setEmpSal(983.42333);
		
		System.out.println("empId "+emp1.getEmpId());
		System.out.println("empId "+emp1.getEmpName());
		System.out.println("empId "+emp1.getEmpSal());
		System.out.println("emp: "+emp1);
	}
}
