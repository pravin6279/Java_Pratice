package com.ReverseArray.Demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pravin";
		
		char [] arr = s.toCharArray();
		
		for(int i = arr.length-1; i >=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
