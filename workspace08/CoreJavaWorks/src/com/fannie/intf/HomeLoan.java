package com.fannie.intf;

public class HomeLoan implements Loan{
	private int amount;
	
	public HomeLoan(int amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
		System.out.println("Home loan amount is set to "+ this.amount);
	}

	
	@Override
	public void submitLoan() {
		// TODO Auto-generated method stub
		System.out.println("Home Loan submitted");
	}

	@Override
	public void loanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Home loan amount is "+ this.amount);
	}

	@Override
	public void foreClosure() {
		// TODO Auto-generated method stub
		System.out.println("Home loan foreclosed with "+ this.amount);
	}

	@Override
	public void foreClosure(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Home loan foreclosed with "+ (this.amount-amount));
	}
	
}
