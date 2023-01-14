package com.collectionDemo.linearSearch;

import java.util.Scanner;

public class LinearDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Linear Search..");
		
		Scanner sc =   new  Scanner(System.in);
		System.out.println("Enter the element you want");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Eneter the element");
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("enter the element you want to search");
		int search = sc.nextInt();
		
		int  temp = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]==search) {
				System.out.println("Element found at "+i+" Position");
			}
			
		}if(temp==0) {
			System.out.println("Element not in list");
		}
	}

}
