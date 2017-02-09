package com.fannie.intf;

import java.util.Arrays;
import java.util.Comparator;

public class EmpSortClient {
	public static void main(String[] args){
		Emp [] emps= {
				new Emp(934, "Frank", 100),
				new Emp(9234, "Jason",97),
				new Emp(8435, "Brian",80000),
				new Emp(823, "Allan")
		};
		
		System.out.println("Before Sort: ");
		for (Emp temp: emps){
			System.out.println(temp);
		}
		
		//Arrays.sort(emps, new EmpSorter());
		//equivalent to EmpSorter
		Arrays.sort(emps, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return o2.getEmpName().compareTo(o2.getEmpName());
			}
		});
		System.out.println("After Sort: ");
		for (Emp temp: emps){
			System.out.println(temp);
		}
	}

}
