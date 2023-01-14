package com.ArrayList.Demo;

import java.util.ArrayList;

public class ArryListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
		
		//add element at index position
		list.add(1, 4);
		System.out.println(list);
		
		//get element
		System.out.println(list.get(4));
		
		//set  element
		list.set(2, 4);
		System.out.println(list);
		
		//delete
		list.remove(4);
		System.out.println(list);
		
		//add element 
		list.add(1, 9);
		System.out.println(list);
		
		//sorting  element
		list.sort(null);
		System.out.println(list);
		
	}

}
