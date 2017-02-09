package com.fannie.excep;

import java.io.IOException;

public class Expt4 {
	public static void submitLoan(String loanType, String cusName, int amount) throws IOException {
		if (amount<10000){
			throw new IOException("Sorry loan not processed due to low amount");
		}
		
	}
	
	public static void main(String[] args)  {
		try{
			submitLoan("ARM5", "LX", 100);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
