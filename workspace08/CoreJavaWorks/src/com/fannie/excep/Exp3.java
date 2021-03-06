package com.fannie.excep;

public class Exp3 {
	public static void chkName(String empName){
		if (empName.length()<4){
			throw new RuntimeException("sorry name too short for "+empName);
		}
	}
	public static void chkSalary(double salary, String empName){
		
		try{
			chkName(empName);
			if(salary<1000){		
				throw new ArithmeticException("sorry salary is less, for "+empName+ " given "+salary);
			}else{
				System.out.println("Salary under process" + empName +" ,   "+salary);
			}
		}catch(RuntimeException ee){
			throw new RuntimeException("sorry wrong again", ee);
		}
		finally{
			System.out.println("processsed");
		}
	}
	public static void main(String[] args) {
		chkSalary(90000, "Jon");
	}
}
