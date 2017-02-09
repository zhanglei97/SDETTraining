package com.fannie.io;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FileExample {
	public static void main(String[] args) {
		File f = new File("sample.txt");
		
		try {
			System.out.println("save file "+ f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getFreeSpace());
		try {
			System.out.println(f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.canRead());
		System.out.println("delete file "+f.delete());

	}
}
