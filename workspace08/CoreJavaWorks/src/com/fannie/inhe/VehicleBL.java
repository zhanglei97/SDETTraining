package com.fannie.inhe;

public class VehicleBL  {
	public void display(Vehicle[] vehicles){
		for ( Vehicle temp: vehicles){
			temp.move();
			((FourWheeler)temp).sterling();
			
			if (temp instanceof Car){
				System.out.println(((Car)temp).getModel());
			}else if (temp instanceof Jeep){
				System.out.println(((Jeep)temp).getMake());
			}
		}
	}
}
