package com.filehandling.create;

import java.io.File;
import java.io.IOException;

public class Createfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D://demo.txt");
		
		try {
			if(file.exists()) {
				System.out.println("File already Exists");
			}
			else {
				file.createNewFile();
				System.out.println("File create Sucessfully");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
