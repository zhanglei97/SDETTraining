package com.fannie.interfaces;

import java.util.List;

import com.fannie.bean.Account;

public interface IAccountDAO {
	public boolean insertAccount(Account act);
	public List<Account> getAllAct();
	public Account getAct(int actID);
	public boolean updateAct(int actID, double actBal);
	public boolean deleteAct(int actID);
	List<Account> getAllacts();
}
 