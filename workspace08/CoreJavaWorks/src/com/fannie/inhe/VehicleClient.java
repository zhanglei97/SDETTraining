package com.fannie.inhe;

public class VehicleClient {
	public static void main(String[] args){
		Vehicle [] vehicles = new Vehicle[5];
		vehicles[0] = new Car("BMW");
		vehicles[1] = new Jeep("Blue", "Jeep", 4, 4);
		vehicles[2]= new Jeep("red ","ep", 4, 4);
		vehicles[3]= new Jeep("gree", "nJeep", 4, 4);
		vehicles[4]= new Jeep("sand","land", 4, 4);
		
		new VehicleBL().display(vehicles);

	}
 
}