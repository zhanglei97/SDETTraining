package com.fannie;

interface MyCar{
	String BMW="BMW";
	String AUDI="AUDI";
	String Nexus="Nexus";
}

public class Car {
	public static Car getMyCar(String carName){
		if (carName.equals("BMW")){
			return new BMW();
		}else if (carName.equals("AUDI")){
			return new AUDI();
		}else {
			return new Nexus();
		}
	}

}

class BMW extends Car{
	public BMW(){
		System.out.println("bmw constructor");
	}
	
}

class AUDI extends Car{
	public AUDI(){
		System.out.println("AUDI constructor");
	}
}

class Nexus extends Car{
	public Nexus(){
		System.out.println("Nexus constructor");
	}
}
