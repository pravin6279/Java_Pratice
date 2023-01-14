package com.collectionDemo.ListSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set sobj = new HashSet();
//		Set<Integer> sobj = new HashSet();	
		sobj.add(100);
		sobj.add("Pravin");
		sobj.add("Java");
		sobj.add(200);
		sobj.add(700);
		
		//sobj.remove(700);
		System.out.println(sobj);
		
		Iterator ltr=sobj.iterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}

}
