package com.collectionDemo.linearSearch;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20,8,9,300,23,5,7,101,1002};
		
		int max= arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];	
			}
			
			
		}
		System.out.println("Lagrest number is:"+max);
		
	}

}
