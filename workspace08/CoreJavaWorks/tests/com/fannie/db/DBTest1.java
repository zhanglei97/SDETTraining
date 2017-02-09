package com.fannie.db;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fannie.dbworks.EmpBean;
import com.fannie.dbworks.EmployeeDB;

public class DBTest1 {
	static EmployeeDB edb = new EmployeeDB();
	static EmpBean bean = new EmpBean();
	
	@BeforeClass
	public static void empObjectInit(){
		System.out.println("New DBtest1: get before class called");
		edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	@AfterClass
	public static void empObjecclose(){
		System.out.println("New DBtest1: get after class closed");
		edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	@Test
	public void getEmployeeNotNullTest(){
		assertNotNull("Expected not null after getting employee", edb.getEmployee());
		
	}
	
	@Test
	public void getEmployeeNullTest(){
		assertNull("Expected not null after getting employee", edb.getEmployee());
		
	}
	

}
