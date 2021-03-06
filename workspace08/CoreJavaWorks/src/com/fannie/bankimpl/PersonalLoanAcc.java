package com.fannie.bankimpl;

import com.fannie.bank.DebitInterest;
import com.fannie.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc,  DebitInterest{
	private String actName;
	private double balance;
	private static  double interest=0.0275;

	public PersonalLoanAcc(String name, double amt) {
		// TODO Auto-generated constructor stub
		createAcc(name, amt);
	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("dedict monthly interest");
		
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("dedict half year interest");
		
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("dedict annual interest");
		
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("repay principal");
		
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("pay interest");
		
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("pay partial principal");
		
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
