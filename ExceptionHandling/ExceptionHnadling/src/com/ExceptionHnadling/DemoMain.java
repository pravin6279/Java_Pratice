package com.ExceptionHnadling;

public class DemoMain {
	
	DemoMain(int a,int b){
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj= new Demo();
		try {
			obj.Divide();
		}
		catch(Exception e) {
			//System.out.println("Exception is handle sucessfully...");
			//e.printStackTrace();
			System.out.println("Sucessfully Handled....");
		}
		/*
		 * DemoMain obj1 = new DemoMain(); obj1.addition();
		 */
		DemoMain obj1 = new DemoMain(100,200);
		
	}

}
