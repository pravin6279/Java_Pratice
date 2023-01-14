package com.collectionDemo.ListSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj = new ArrayList();
		/* List<Integer> obj = new ArrayList(); */
		
		obj.add(10);
		obj.add(1, 40);
		obj.add("Pravin");
		//obj.add(2, 60);
		obj.add(3, 90);
		
		System.out.println(obj);
		//obj.remove(1);

		//System.out.println(obj);
		/*
		 * Iterator itr = obj.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
	
		ListIterator litr=obj.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("__________________/////_______________________");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
