package com.MaximumNumber.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr  = {2,44,98,54,4,8,32};
		
		int max = arr[0];
		
		for(int i = 1;i<arr.length; i++) {
			
			   if(max > arr[i]) 
			 {
				max = arr[i];
			
		
			 }
				System.out.println(max);
		
		}
		System.out.println("Hello World...");
 	}

}
