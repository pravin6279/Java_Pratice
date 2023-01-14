package com.collectionDemo.linearSearch;

import java.util.Scanner;

public class Demo6 {


	public static void main(String[] args) {

		System.out.println("Welcome to Linear Search");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the element you want");
		int  num = sc.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Enetr the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enetr the element you want search:");
		int search = sc.nextInt();
		int temp =0;
		
		for (int j=0;j<arr.length;j++) {
			if(arr[j]==search) {
				System.out.println("Element found at "+j+" Position");
				temp =temp+1;
			}
		}
		
		if(temp==0) {
			System.out.println("Element not in this list.....");
		}
		}

	
	}


