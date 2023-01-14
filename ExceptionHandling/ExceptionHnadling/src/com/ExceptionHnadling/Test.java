package com.ExceptionHnadling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		
		try {
			obj.Divide();
		}
		catch (Exception e){
			System.out.println("Arithmetic Exception");
			
		}

	}
	public void Divide() {
		int a= 100,b=0,c;
		c= a/b;
		System.out.println(c);
	}

}
