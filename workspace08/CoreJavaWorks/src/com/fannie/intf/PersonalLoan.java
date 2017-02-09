package com.fannie.intf;

public class PersonalLoan implements Loan {
	private int amount;
	
	
	public PersonalLoan(int amount){
		this.amount=amount;
		System.out.println("Person loan amount set "+amount);
	}
	public void submitLoan() {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan submitted");
	}

	@Override
	public void loanAmount() {
		// TODO Auto-generated method stub

		System.out.println("Person loan amount is "+amount);
	}

	@Override
	public void foreClosure() {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan foreclosed with full " + this.amount);
	}

	@Override
	public void foreClosure(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Personal loan forecosed with " + (this.amount-amount));
	}

}
