package com.fannie.intf;

import java.util.Arrays;

public class SortPrimitive {
	public static void main(String[] args){
		int [] nums = new int[7];
		
		nums[0] = 1;
		nums[1] = 1;
		nums[2] = 123;
		nums[3] = 1324;
		nums[4] = 741;
		nums[5] = 1;
		nums[6] = 141;
		
		System.out.println("Original List: ");
		for (int i: nums){
			System.out.println(i);
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
		System.out.println("sorted List: ");
		Arrays.sort(nums);;
		for (int i: nums){
			System.out.println(i);
		}
	}
	

}
