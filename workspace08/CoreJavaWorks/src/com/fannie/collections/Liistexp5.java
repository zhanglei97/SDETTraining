package com.fannie.collections;

import java.util.LinkedList;

public class Liistexp5 {
	public static void main(String[] args) {
		LinkedList<String> lList= new LinkedList<String>();
		
		lList.add("zero");
		lList.add("one:");
		lList.add("two:");
		lList.add("Three");
		lList.add("four:");
		lList.add("five:");
		
		lList.removeFirst();
		
		System.out.println(lList);
	}
}
