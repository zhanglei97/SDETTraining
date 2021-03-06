package com.fannie.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fannie.bean.Account;
import com.fannie.connection.GetConnection;
import com.fannie.interfaces.IAccountDAO;

public class AccountDAO implements IAccountDAO {

	@Override
	public List<Account> getAllacts() {
		// this query may return nothing or all
		String sql = "select actid, account_name, Balance, Average_Balance from Account";
		List<Account> acts = new ArrayList<Account>();
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);

			gc.rs = gc.ps.executeQuery();
			for (; gc.rs.next();) {
				Account tact = new Account(0, 0, 0);
				tact.getAccID();
				tact.getActBal();
				tact.getAvgActBal();

				acts.add(tact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return acts;
	}

	@Override
	public boolean insertAccount(Account act) {
		try {
			String sql = "insert into Account  (account_number, Balance, Average_Balance) values(?,?,?)";

			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setLong(1, act.getAccID());
			gc.ps.setDouble(2, act.getActBal());
			gc.ps.setDouble(3, act.getAvgActBal());

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Account> getAllAct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAct(int actID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAct(int actID, double actBal) {
		String sql = "update Account set Balance = ? where account_number =?";

		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setDouble(1, actBal);
			gc.ps.setInt(2, actID);

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteAct(int actID) {
		String sql ="delete from Account where account_number=?";
		
		GetConnection gc = new GetConnection();
		try {
//			GetConnection.mysqlCon().setAutoCommit(false);
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setInt(1, actID);
			
			return gc.ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			try {
				GetConnection.mysqlCon().rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
	