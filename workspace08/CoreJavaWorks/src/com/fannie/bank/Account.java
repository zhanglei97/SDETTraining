package com.fannie.bank;

public interface Account {
	
	public String savingType="Saving";
	public String fixedType="Fixed";
	public String pLoanType="PersonalLoan";
	public String hLoanType="HousingLoan";

	void createAcc(String name, double amt);
}
