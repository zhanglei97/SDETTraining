package com.clients;

public class CallerBusinessLogic {
	public static void main(String[] args) {
		
		try {
			Class.forName("Something is working");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
