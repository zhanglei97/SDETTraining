package com.fannie.excep;

public class AccountClient {
	public static void main(String[] args) {
		Account[] acts = {new Account(100), new Account(5924), new Account(88342), new Account(9358.4395)};
		for (Account tmp: acts){
			System.out.println("my account is " + tmp.getAccId()+" with balance "+tmp.getAccBal());
			
		}

	}
}