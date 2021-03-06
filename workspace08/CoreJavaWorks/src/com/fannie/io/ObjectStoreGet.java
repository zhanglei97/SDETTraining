package com.fannie.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreGet {
	public static int linecnt=0;
	public static void storeObject(Customer cust) throws IOException{
		File f = new File("customerfile.ser");	
		FileOutputStream  fos= null;
		ObjectOutputStream oos = null;
		
		try{
			 fos=  new FileOutputStream(f);
			 oos =new ObjectOutputStream(fos);
			 
			 oos.writeObject(cust);
			 oos.writeObject(new Double(2000));
			 oos.writeInt(12345);
			 oos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fos.close();
				oos.close();
			}catch(IOException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}			
		}
				
		
		System.out.println("data written");
				
	};
	public static void getObject() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customerfile.ser"));
		
		Customer cust = (Customer) ois.readObject();
		System.out.println(cust);
		System.out.println(ois.readObject());
		System.out.println(ois.readInt());
		
		ois.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		Customer cus = new Customer(1324, "kjljhl");
		storeObject(cus);
		try {
			getObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
