package com.fannie.collections;

import java.util.Set;
import java.util.TreeSet;

//tree set
public class SetExp3 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ddd");
		set.add("bbb");
		set.add("aab");
		set.add("ccc");
		set.add("eee");
		set.add("fff");
		
		System.out.println(set);
	}
}
