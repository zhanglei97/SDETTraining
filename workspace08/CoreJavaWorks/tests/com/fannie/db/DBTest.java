package com.fannie.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fannie.dbworks.EmpBean;
import com.fannie.dbworks.EmployeeDB;

public class DBTest {
	static EmployeeDB edb = new EmployeeDB();
	static EmpBean bean = new EmpBean();
	
	@BeforeClass
	public static void empObjectInit(){
		System.out.println("DBTest: before class called");
		edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	@AfterClass
	public static void empObjClose(){
		System.out.println("DBTest: after class closed");
	}
	
	@Before
	public void beforeAllMethods(){
		System.out.println("DBTest: before all methods");
	}
	
	@After
	public void afterAllMethods(){
		System.out.println("DBTest: after all methods");
	}
	
	//to make the method as test case, it has to be annotated by @Test
	@Test(timeout=2000)
	public void inserEmployeePassTest() {		
		assertEquals("Testing to check employee db pass", true, edb.instertEmployee(bean));	
	}

	@Test
	public void inserEmployeeFailTest() {
		//assertEquals("Testing to check employee db fail", false, edb.instertEmployee(bean));
		assertNotEquals("Testing to check employee db fail", false, edb.instertEmployee(bean));
		
	}
}
