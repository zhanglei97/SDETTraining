package com.fannie.abst;

class FigureBL {
	public void display (Figure[] figures){
		for (Figure temp: figures){
			temp.area();
			temp.draw();
		}
	}

}

public class FigureClient {
	public static void main (String[] args){
		Figure[] figures =new Figure[4];
		
		figures[0] = new Rectangle(10,20);
		figures[1] = new Circle(12);		
		figures[2] = new Rectangle(15, 3);
		figures[3] = new Circle(10);
		
		new FigureBL().display(figures);
		
	}
}