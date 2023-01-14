package com.collectionDemo.linearSearch;

public class LinearDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[] = {2,4,5,6,7,9,6,15,29,45};
		
		int search = 29;
		int temp = 0;
		
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element found at "+i+" position");
				temp = temp+1;
			}
		}
		
		if(temp==0) {
			System.out.println("Element not in array");
		}
	}
	
	

}
