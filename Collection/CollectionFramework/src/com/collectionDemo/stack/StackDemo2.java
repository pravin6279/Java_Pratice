package com.collectionDemo.stack;

import java.util.Scanner;

public class StackDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int n;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number  of element you want");
	n = sc.nextInt();
	
	int arr[] = new int[n];
	
	try {
	System.out.println("Enetr the number ");
	for(int i = 0;i<n;i++) {
	
		arr[i] = sc.nextInt();
		
	}
	
	System.out.println("The Elements are ");
	for(int i = 0;i<n;i++) {
		System.out.println(arr[i] +  ":Index at"+ i);
	}
	
	}
	catch (Exception e) {
		System.out.println("Exception is handled");
	}
	}
	
	
	
			
	

}
