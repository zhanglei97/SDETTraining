package com.fannie.excep;

public class Exx2 {
	
	public static void main(String[] args) {
		try{
			//int [] arr = new int[-4];
			return;
		}catch(Exception e){
			//System.out.println("error "+e);
			e.printStackTrace();
		}finally{
			System.out.println("hi, i am finally here");
		}
		
	  System.out.println("so where am i?");
	}
}
