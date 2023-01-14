package com.collectionDemo.linearSearch;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {20,8,9,300,23,5,7,101,1002};
		int min  =arr[0];
		
		for(int i  =1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("samllest number is "+min);
	}

}
