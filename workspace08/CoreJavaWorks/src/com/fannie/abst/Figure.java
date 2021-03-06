package com.fannie.abst;

//in abstract class, we can have abstract methods
public abstract class Figure {
	public final double PI = 3.143592645;
	public abstract void area();
	public void draw(){
		System.out.println("the figure can be draw with pen.");
	}
}
	

class Rectangle extends Figure{
	private int len;
	private int bre;
	
	public Rectangle (int len, int bre){
		super();
		this.len = len;
		this.bre = bre;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is (lxb):" + (len * bre));
	}
}

class Circle extends Figure{
	private int dia;
	public Circle (int dia){
		this.dia = dia;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is (PI*dia):" + (PI*dia));
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("the figure circle can be draw with pen, with help");
	}
	
	
}