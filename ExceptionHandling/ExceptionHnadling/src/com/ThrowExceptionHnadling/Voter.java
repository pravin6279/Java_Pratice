package com.ThrowExceptionHnadling;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age -");
	
	int age = sc.nextInt();
	
	try {
		if(age <18) {
			 throw new YoungerException("You are not eligible for vote");
		}
		else {
			System.out.println("You are  eligible for vote");
		}
	}
	catch(YoungerException e){
		e.printStackTrace();
		
	}
	}

}
