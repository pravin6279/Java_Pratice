package com.Inheritance.Demo;

public class Splendor extends Bike{  
		  public void run()
		  {
			  System.out.println("running safely with 60km");
			  }  
		  
		  public static void main(String args[]){  
		    Bike b = new Splendor();//upcasting  
		    b.run();  
		  }  

}
