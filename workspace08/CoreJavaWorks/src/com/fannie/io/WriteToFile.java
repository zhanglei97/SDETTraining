package com.fannie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class WriteToFile {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter(new FileWriter("samplewriter.txt", true));
		BufferedReader fbr = new BufferedReader(new FileReader("samplewriter.txt"));
		/*
		int empId;
		String empName;
		double empSal;
		
		System.out.println("Enter Emp ID");
		empId= Integer.parseInt(br.readLine());
		
		System.out.println("Enter Emp Name");
		empName = br.readLine();
		
		System.out.println("Enter Emp Salary ");
		empSal = Double.parseDouble(br.readLine());
		
		
		bw.write("-------------------------\n");
		bw.write(new Integer(empId).toString());
		bw.newLine();
		bw.write(empName);
		bw.newLine();
		bw.write(new Double(empSal).toString());
		bw.newLine();
		
		bw.newLine();
		bw.write("emp id:"+empId + " emp Name: "+ empName + "Emp Salary: "+ empSal);
		bw.newLine();
		bw.newLine();

		bw.close();
		System.out.println("data saved");
*/		
		
		System.out.println(fbr.readLine());
		
	}

}
