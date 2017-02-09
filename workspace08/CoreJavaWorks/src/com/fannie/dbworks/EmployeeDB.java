package com.fannie.dbworks;


public class EmployeeDB {
	public boolean  instertEmployee(EmpBean bean) {
		//simulating it's connecting to db and doing operation
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public EmpBean getEmployee(){
		return null;
		//return new EmpBean();
	}
	

}
