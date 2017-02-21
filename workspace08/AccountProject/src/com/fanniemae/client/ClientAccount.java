package com.fanniemae.client;

import com.fannie.bean.Account;
import com.fannie.dao.AccountDAO;
import com.fannie.interfaces.IAccountDAO;

public class ClientAccount {

	public static void main(String[] args) {
		IAccountDAO dao = new AccountDAO();
		System.out.println("-------------------");
		dao.insertAccount(new Account(2, 21324.33, 2.32423));
			System.out.println("current employee: "+dao);
	}	
		
}
