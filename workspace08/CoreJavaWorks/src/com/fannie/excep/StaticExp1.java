package com.fannie.excep;
class Testing{
	public static void testMe(){
		System.out.println("testing me");
	}
	public static int calMe(int a, int b){
		System.out.println("testing me cal "+(a+b));
		return a+b;
	}
}

public class StaticExp1 {
	private static int x=0;
	private static int y=0;
	
	static{
		System.out.println("just static block");
	}
	public static int add(int a, int b, int c){
		return a+b+c;
	}
	
	public int minus(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		hello();
		x = add(22, 34, 103);
		System.out.println("static x is "+x );
		int x = add(3,55,1);
		System.out.println("who is x " +x);
		System.out.println("static x "+ StaticExp1.x);
		
		

		int xz = add(3, 55, 1);
		System.out.println("who is xz " + xz);
		
		StaticExp1 yx = new StaticExp1();
		 y = yx.minus(x, 1343);
		System.out.println(y);
		
		hello();
		
		Testing.testMe();
		Testing.calMe(33, 88);
	}
	
	public static void hello(){
		System.out.println("hello x " + x +" y "+ y);
	}

}
