package com.fannie.collections;

import java.util.HashSet;

public class SetExp1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Andy");
		System.out.println(set);
		set.add("Ann");
		System.out.println(set);
		set.add("Amit");
		System.out.println(set);
		set.add("Becky");
		System.out.println(set);
		set.add("Ron");
		System.out.println(set);
		set.add("Andy");
		System.out.println(set);
		
		
		System.out.println(set);
		
		for (String temp: set){
			System.out.println(temp);
		}
	}
}
