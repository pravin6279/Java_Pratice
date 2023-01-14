package com.collectionDemo.BinarySearch;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Binary Search");
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Eneter the element you want");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enetr the element in ascending order");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int search = sc.nextInt();
		
		int li=0;
		int hi = arr.length-1;
		int mi  = (li+hi)/2;
		
		while(li<hi) {
			if(arr[mi]==search) {
				System.out.println("Elemnet found at "+mi+" position");
				break;
			}
			else if(arr[mi]<search) {
				li = mi+1;
			}
			else {
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element is not found");
		}
	}
}

