package com.fannie.client;

import com.fannie.beans.Employee;
import com.fannie.dao.EmployeeDAO;
import com.fannie.interfaces.IEmployeeDAO;

public class ClientEmp {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();

	/*	System.out.println(dao.insertEmployee(
			new Employee(" Suresh", 223344, "Suresh@fanniemae.com")));
			*/
		
	/*	Employee emp = dao.getEmp(1);
		
		System.out.println("emp id " + emp.getEmpId());
		System.out.println("Emp Name " + emp.getEmpName());
		System.out.println("Emp Sal " + emp.getEmpSal());
		System.out.println("Emp Email " + emp.getEmpEmail());
		*/
		
		for(Employee emp : dao.getAllEmps()){
			System.out.println(emp);
		}
		
		
	}
}
