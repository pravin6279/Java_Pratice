package com.collectionDemo.arrayList;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al  = new ArrayList();
     
     //here we are add element
      al.add(2);
      al.add(54);
      al.add(23500);
      
    System.out.println(al);
    
    ArrayList al2 = new  ArrayList();
    al2.add("Pravin");
    al2.add("Sudhir");
    al2.add("Gaikwad");
    System.out.println(al2);
    
   al.addAll(al2);
//    System.out.println(al);
//    al.remove("Pravin");
//    System.out.println(al);
//    
//    al.add(3,"Pravin" );
//    System.out.println(al);
//    
//    
    al.add("Pravin");
    System.out.println(al);
    
   
//    System.out.println( al.contains("Pravin"));
//    
//    System.out.println(al.contains(54));
//    System.out.println(al.remove(54));  here we are provide interger value here take index 
       System.out.println(al.remove("Pravin"));
       System.out.println(al);
      // al.clear();
       //System.out.println(al);
      System.out.println( "size of arraylist : "+al.size());
      
      
    
	}

}
