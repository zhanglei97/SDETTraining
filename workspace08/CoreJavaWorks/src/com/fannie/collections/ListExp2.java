package com.fannie.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListExp2 {
	public static void main(String[] args) {
		ArrayList<String> alst= new ArrayList<String>();
		
		System.out.println("size is "+alst.size());
		alst.add("Hello");
		alst.add("are");
		alst.add("dasfasfdas");
		alst.add("you");
		alst.add("ok");
		System.out.println("size is "+alst.size());
		System.out.println(alst);
		Iterator<String> itr=alst.iterator();
		while(itr.hasNext()){
			String temp =itr.next();
			System.out.println("Iteration: "+temp);
		}
		
		System.out.println("sub list:" +alst.subList(2, alst.size()));
		
		List<String> newList = alst.subList(3, alst.size());
		
		System.out.println("new list: " +newList);
		
		
		String [] arr = (String[])newList.toArray(new String[newList.size()]);
		
		
		for (String temp: arr){
			System.out.println("show temp "+temp);
		}
		

		
		
		System.out.println(newList);
		
		alst.remove(2);
		
		System.out.println("-----------------");
		
		for (String temp: alst){
			System.out.println(temp);
		}
		
		
	}	

}