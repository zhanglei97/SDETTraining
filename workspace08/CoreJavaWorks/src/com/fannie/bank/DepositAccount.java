package com.fannie.bank;

public interface DepositAccount extends Account{
	public void withdraw(double amt);
	public void deposit(double amt);
	public double getBalance();

}
