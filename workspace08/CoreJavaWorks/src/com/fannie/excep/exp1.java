package com.fannie.excep;

public class exp1 {
	public static void main(String[] args) {
		 	
		try{
			int num1=20;
			int num2 = 0;
			int res =0 ;
			
			try{
				int [] arr = new int[4];
				
				arr[10]=100;
				
				res=num1/num2;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("array error " +e);
			}catch(NegativeArraySizeException nase){
				System.out.println("********" + nase);
			}
			
			
			System.out.println("result is "+res);	
		}catch(ArithmeticException e){
			System.out.println("arti rror " + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array error " +e);
		}
		catch(Exception e){
			System.out.println("error " + e);
		}
		finally{
			System.out.println("someother business logic should be here too: ");
		}

			System.out.println("someother business logic should be here too: ");
		
		
		
		
	}

}
