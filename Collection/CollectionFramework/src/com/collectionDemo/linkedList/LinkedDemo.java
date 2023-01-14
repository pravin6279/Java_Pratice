package com.collectionDemo.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		
		obj.add(10);
		obj.add(1, "Pravin");
		obj.add(120.86);
		obj.add('c');
		
		System.out.println(obj);
		
		obj.addFirst("Gaikwad");
		System.out.println(obj);
		
		obj.addLast("Sudhir");
		System.out.println(obj);
		/*
		 * obj.remove("Pravin"); 
		 * System.out.println(obj);
		 */
		obj.removeFirst();
		System.out.println(obj);
		/*
		 * obj.remove(3); System.out.println(obj);
		 * 
		 * System.out.println(obj.getFirst()); System.out.println(obj.getLast());
		 */
		Iterator itr= obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
