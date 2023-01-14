package com.filehandling.gettingInfo;

import java.io.File;
import java.io.IOException;

public class getinfofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =  new File ("D://demo.txt");
		
		if(file.exists()) {
			System.out.println(file.getName()+" File already  exists");
			System.out.println(file.getAbsolutePath()+" :is path");
		}
		else {
			try {
				file.createNewFile();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println(file.getName()+"File create sucessfully");
			System.out.println(file.getAbsolutePath()+" :is path");
			
		}
		if(file.canRead()) {
			System.out.println("File can be readbale ");
		}
		else {
		System.out.println("File Cannot Reable");
		}
		if(file.canWrite()) {
			System.out.println("File can  be  Writble");
		}
		else {
			System.out.println("File cannot writble");
		}
		if(file.canExecute()) {
			System.out.println("file can be executable");
		}
		else {
			System.out.println("file cannot writble");
		}
	}

}
