package com.collectionDemo.arrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n  = 5;
		ArrayList al = new ArrayList();
		
		for (int i=1;i<=n;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		for(int i = 0 ;i<=al.size();i++) {
			System.out.print(al.get(i)+"");
			}	
	}

}
