package com.fannie.inhe;

public class InheExe {

		public static void main (String[] args){
			C objC =new C();
			System.out.println(objC);
		}

		@Override
		public String toString() {
			return "InheExe [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
}

class A {
	A(){
		super();
		System.out.println("hi from A");
	}
	


}

 class B extends A{
	B(){
		super();
		System.out.println("hi from B");
	}
	
}

 class C extends B{
	C(){
		super();
		System.out.println("hi from C");
	}
	
}