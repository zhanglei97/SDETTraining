package com.clients;

import com.fannie.Customer;
import com.fannie.Name;

public class CustomerClient {
	public static void main(String[] args){
		Customer cus = new Customer();
		cus.setcId(101);
		Name name= new Name();
		
		name.setFirstName("Peter");
		name.setLastName("Ownes");
		
		cus.setName(name);
		
		cus.setSal(1000.23);
		
		System.out.println(cus.getName().getLastName());
		System.out.println(cus.getName().getFirstName());
		System.out.println(cus);
	}

}
