package com.fannie.collections;
//java doesn't support polymorphism on collection
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WildcardExp {
	//wild card can't be used in Add
	public static void display(Set <? extends Number> set){
		
		System.out.println(set);
		
		for (Number temp: set){
			System.out.println(temp);
		}
		
	}
	public static void main(String[] args) {
		Set<Number> set;
		Set<Integer> iSet = new HashSet<Integer>();
		
		iSet.add(100);
		iSet.add(23);
		iSet.add(200);
		iSet.add(800);
		
		Set<Double> dSet = new TreeSet<Double>();
		
		dSet.add(2034d);
		dSet.add(1034d);
		dSet.add(20d);
		
		display(dSet);
		display(iSet);
	}
}
