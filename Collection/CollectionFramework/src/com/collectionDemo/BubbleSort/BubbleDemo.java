package com.collectionDemo.BubbleSort;

import java.util.Scanner;

public class BubbleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bubble Sort");
		 int temp=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the element you want");
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the element ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			 
			  for(int j=0;j<arr.length;j++) {
				  for(int k = 0;k < arr.length-1-j;k++)
			  {
			       if(arr[j]>arr[j+1])
			  {
				  //Swap the number 
				  temp = arr[j]; 
				  arr[j] =arr[j+1];
				  arr[j+1]=temp; 
				 
			   } 
			  }
			  }  


		}
		 
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		} 
	}

}
