package com.fannie.intf;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortString {
	public static void main(String[] args){
		String [] str = {"Hi", "how", "things", "going"};
		
		Arrays.sort(str);
		for (String tmp: str){
			System.out.println(tmp);
		}
	}

}
