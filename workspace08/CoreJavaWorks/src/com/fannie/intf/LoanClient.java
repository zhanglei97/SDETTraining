package com.fannie.intf;

import java.util.Arrays;

public class LoanClient {
	public static void main(String[] args){
		Loan[] loans =new Loan[4];
		
		loans[0]= new HomeLoan(1000);
		loans[1]=new PersonalLoan(1002394);
		loans[2]= new HomeLoan(12324);
		loans[3] = new PersonalLoan(34234);
		
		for (Loan temp: loans){
			System.out.println("-----------------------------");
			temp.submitLoan();
			temp.loanAmount();
		}
		
		
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
		loans[1].foreClosure();
		loans[2].foreClosure(1333);
		
	}

}
