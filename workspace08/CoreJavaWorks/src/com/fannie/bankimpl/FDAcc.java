package com.fannie.bankimpl;


import com.fannie.bank.CreditInterest;
import com.fannie.bank.DepositAccount;

public class FDAcc implements DepositAccount, CreditInterest{
	private String actName;
	private double balance;
	private static  double interest=0.0015;

	public FDAcc(String name, double amt) {
		// TODO Auto-generated constructor stub
		createAcc(name, amt);
	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("add monthly interest");
		
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("add half year interest");
		
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("add annual interest");
		
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		System.out.println("withdraw "+amt);
		
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		balance = balance+amt;
		System.out.println("deposit with "+amt +" new balance is "+balance);
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("return monthly interest " +balance);
		return balance;
		
	}

	@Override
	public void createAcc(String name, double amt) {
		// TODO Auto-generated method stub
		this.setActName(name);
		this.balance=amt;
		
		System.out.println("account created for " +name +" with amount "+amt);
	}

	@Override
	public double calcInt() {
		// TODO Auto-generated method stub
		double dayInterest=balance*interest;
		System.out.println("interest calculated to be "+dayInterest);
		return dayInterest;
		
	}
	
	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}


}
