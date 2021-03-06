package com.fannie.inhe;

public class Jeep extends FourWheeler {
	private String make;
	private String model;
	private int doors;
	private int seats;
	
	public Jeep (String make, String model, int doors, int seats){
		System.out.println("my car is a jeep");
		this.doors=doors;
		this.seats=seats;
		this.make=make;
		this.model=model;
	
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getDoors() {
		return doors;
	}

	public int getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Jeep [make=" + make + ", model=" + model + ", doors=" + doors + ", seats=" + seats + "]";
	}

	
}
