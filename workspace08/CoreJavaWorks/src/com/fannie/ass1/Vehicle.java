package com.fannie.ass1;

public abstract class Vehicle {
	private String color;
	private int wheelCount;
	private String make;
	private String model;
	
	public void park(){
		System.out.println    ("All vehicle need to park");
	}
	
	public void drive(){
		System.out.println("All vehicle drives on the road");
	}
	
	public abstract void move();
	
	public Vehicle(String color, int wheelCount, String make, String model) {
		super();
		this.color = color;
		this.wheelCount = wheelCount;
		this.make = make;
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheelCount() {
		return wheelCount;
	}
	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
