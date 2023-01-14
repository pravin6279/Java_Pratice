package com.collectionDemo.linearSearch;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Pravin";
		
		char ch[]= s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
