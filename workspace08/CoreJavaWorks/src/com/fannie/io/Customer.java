package com.fannie.io;

import java.io.Serializable;

public class Customer  implements Serializable{
	private int cusId;
	private String cusName;
	
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + "]";
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public Customer(int cusId, String cusName) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
	}
	
	

}
