package com.fannie.threads;

class ThirdPartyBusiness{
	public void disount(){
		System.out.println("this is a discount");
	}
}
class MyBusiness implements Runnable{
	Thread t;
	int  cnt;
	
	MyBusiness(String name, int priority, int cnt){
		t=new Thread(this, name);
		t.setPriority(priority);
		this.cnt=cnt;
		
		//when start is invoked then it creates an os level thread
		t.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<cnt; i++){
			System.out.println(" do My business"+i+" in Thread "+Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
		}
		System.out.println("Tread "+Thread.currentThread().getName()+" of "+ cnt+" existing");
		

	}
	
	
}
public class RunnableEx1 {
	
	public static void main(String[] args) {
		MyBusiness m1 = new MyBusiness("electronics", Thread.MAX_PRIORITY, 10);
		MyBusiness m2 = new MyBusiness("mortgage", Thread.MIN_PRIORITY, 5);
		MyBusiness m3 = new MyBusiness("Petmart", 3, 15);
		
	}

}
