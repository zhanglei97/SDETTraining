package com.fannie.collections;
import java.util.Vector;

public class ListEx4 {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(5,3);
		
		System.out.println("initial capacity is: "+vec.capacity());
		System.out.println("initial size is: "+vec.size());
		
		vec.add("one:");
		vec.add("two:");
		vec.add("Three");
		vec.add("four:");
		vec.add("five:");
		System.out.println("current capacity is: "+vec.capacity());
		System.out.println("current size is: "+vec.size());
		vec.add("six");
		vec.add("seven:");
		vec.add("eight:");
		vec.add("nine");
		System.out.println("current capacity is: "+vec.capacity());
		System.out.println("current size is: "+vec.size());
		vec.add("ten:");
		vec.add("eleven:");
		vec.add("tewelve");
		
		System.out.println("current capacity is: "+vec.capacity());
		System.out.println("current size is: "+vec.size());
		
		vec.ensureCapacity(20);
		System.out.println("current capacity is: "+vec.capacity());
		System.out.println("current size is: "+vec.size());
		
	}
}
