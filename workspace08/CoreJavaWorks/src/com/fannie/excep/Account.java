package com.fannie.excep;

public class Account {
	private int accId;
	private double accBal;
	private static int count=1000;
	
	public Account( double accBal) {
		this.accBal = accBal;
		this.accId = count++;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public static void main(String[] args) {
		System.out.println("so i am here");
	}

}
