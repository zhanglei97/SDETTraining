package com.fannie.bankimpl;

import com.fannie.bank.Account;

public class MyAccount {
	public static void main(String[] args){
		Account[] accounts =new Account[4];
		
		accounts[0]= new SavingsAcc("Amy", 34432);
		accounts[1]=new PersonalLoanAcc("Chang", 234.53);
		accounts[2]= new FDAcc("David", 12324);

		((SavingsAcc) accounts[0]).addMonthlyInt();
		((SavingsAcc) accounts[0]).withdraw(1324);
		
		((PersonalLoanAcc) accounts[1]).deductMonthlyInt();
		((PersonalLoanAcc) accounts[1]).repayPrincipal();
		
		((FDAcc) accounts[2]).getBalance();
		((FDAcc) accounts[2]).deposit(1111);
		((FDAcc) accounts[2]).getBalance();
		
	}

}
