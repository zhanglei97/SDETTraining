package com.fannie.intf;

import java.util.Comparator;

public class EmpSorter implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		System.out.println( (o1.getEmpSal()-o2.getEmpSal()));
		// TODO Auto-generated method stub
		return (int) (o1.getEmpSal()-o2.getEmpSal());
	}

}
