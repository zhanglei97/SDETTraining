package com.fannie.ass1;
public class VehicleClient {
	public static void main(String[] args) {
		Vehicle [] vehicles =new Vehicle[5];
		vehicles[0]= new Truck("White", 4, "Toyota" , "Tocama SR5");
		vehicles[1]= new Bus("Yellow", 8, "AEC", "AEC Qtype" );
		vehicles[2]= new Car("Sand", 4, "Honda", "Civic");
		vehicles[3]= new Truck("Black", 18, "Volvo", "Detriot 105" );	
		vehicles[4]= new Car("Red", 4, "Toyota", "Camery");
		
		Road road = new Road();
		
		for (Vehicle temp: vehicles ){
			System.out.println(temp);
			if (temp instanceof Car){
				((Car) temp).setSeatCnt(4);
			}else if (temp instanceof Truck){
				((Truck) temp).setWeight(18);
			}else if (temp instanceof Bus){
				((Bus) temp).setPassengerCnt(38);
				((Bus) temp).loadPassenger(22);
			}
			
			temp.drive();
			temp.park();
			road.move(temp);
			System.out.println(temp);
			System.out.println("----------------------");

		}
	}
		
}
