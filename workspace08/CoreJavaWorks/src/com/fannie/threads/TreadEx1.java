package com.fannie.threads;

//by extending the class from Thread, you make it eligible to be asynchnoous 
class BusinessLogic extends Thread{
	String name;
	public BusinessLogic(String name){
		this.name=name;
	}
	public void run(){

		for (int i=0; i<100; i++){
			System.out.println(name+" do BusinessLogic job "+i+" in Thread "+Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
		}

	}
}
//if there is a main method in the class, then it's a tread
//priority: 1 - min, 5- norm (default), 10 - max
public class TreadEx1 {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("name: "+Thread.currentThread().getName());
		System.out.println("priority: "+Thread.currentThread().getPriority());
		
		BusinessLogic bl1=new BusinessLogic("Allen");
		BusinessLogic bl2=new BusinessLogic("frank");
		BusinessLogic bl3=new BusinessLogic("Bell");
		BusinessLogic bl4=new BusinessLogic("Joe");
		
		//when you make a request for start then the os level thread is created 
		//and the control is given to special method called public void run(){}
		// thus asynchronous
		
		bl1.setName("low");
		bl1.setPriority(2);
		bl2.setPriority(10);
		bl2.setName("High");
		bl1.start();
		bl2.start();
		bl3.start();
		bl4.start();
		
		try{
			bl1.join();
			bl2.join();
			bl3.join();
			bl4.join();
		}catch(InterruptedException e){
			e.printStackTrace();
			System.out.println("throw");
		}
		
		for (int i=0; i<100; i++){
			System.out.println(" I am main "+i+" in Thread "+Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
		}
		
		System.out.println("Main Exiting...");
		
		//new BusinessLogic().doMyJob();
	}
}
