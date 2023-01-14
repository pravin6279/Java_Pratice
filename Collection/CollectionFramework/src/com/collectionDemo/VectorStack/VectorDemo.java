package com.collectionDemo.VectorStack;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector obj = new Vector();
		obj.add(10);
		obj.add("Pravin");
		obj.add(30);
		obj.add("Gaikwad");
		System.out.println(obj);
		
	Enumeration e=obj.elements();
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
	

	}

}
