package com.fannie.ass1;

public class Car extends Vehicle {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car move fast");
		
	}
	@Override
	public String toString() {
		return "Car [seatCnt=" + seatCnt + ", getColor()=" + getColor() + ", getWheelCount()=" + getWheelCount()
				+ ", getMake()=" + getMake() + ", getModel()=" + getModel() + "]";
	}

	public Car(String color, int wheelCount, String make, String model) {
		super(color, wheelCount, make, model);
		// TODO Auto-generated constructor stub
	}

	public int getSeatCnt() {
		return seatCnt;
	}

	public void setSeatCnt(int seatCnt) {
		this.seatCnt = seatCnt;
	}

	private int seatCnt;


}