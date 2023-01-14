package com.collectionDemo.constructor;

public class Demo {
	int number1;
	int number2;
	public Demo(int a,int b) {
		 this.number1=a;
		 this.number2 = b;
	}
	
	public Demo(double a,double b) {
		
	}
	
	void display() {
		
		System.out.println("Addition is : "+ (number1+number2));
	}

		 public static void main(String []args) {
			 
			 Demo obj = new Demo(4,5);
			 obj.display();
			 }
		 
		 }
	
