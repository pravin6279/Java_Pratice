package com.collectionDemo.linearSearch;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tne String Value");
		String s = sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
	}

}
