package com.collectionDemo.VectorStack;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector obj = new Vector();
		obj.add(10);
		obj.add(1, "Pravin");
		obj.add(120.86);
		obj.add('c');
		System.out.println(obj);
		
		obj.add(2, "Gaikwad");
		System.out.println(obj);
		
		obj.addElement("Walwa");
		System.out.println(obj);
		
		obj.removeElement("Walwa");
		System.out.println(obj);
		
		obj.removeElementAt(3);
		System.out.println(obj);
		
		//obj.capacity();
		System.out.println(obj.capacity());
		
		
	}

}
