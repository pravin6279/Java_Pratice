package com.accessModifier.demo;

public class Demo2  extends Demo {
	
	public void Math () {
		System.out.println("Public Members");
		System.out.println("public Member :"+a);
		System.out.println("Protected Member :"+b);
		System.out.println("Default Member :"+c);
		//System.out.println("Private Member :"+d);
		System.out.println("- - - - - -- - - - - - - -- - - - - - -  - - - -- - - - - - -- - -");
	}
	 
	protected void Math  (int i) {
		System.out.println("Private Members");
		System.out.println("public Member :"+a);
		System.out.println("Protected Member :"+b);
		System.out.println("Default Member :"+c);
		//System.out.println("Private Member :"+d);
		System.out.println("- - - - - -- - - - - - - -- - - - - - -  - - - -- - - - - - -- - -");
	}
	
	   void Math (String s ) {
		   System.out.println("Default Members");
		System.out.println("public Member :"+a);
		System.out.println("Protected Member :"+b);
		System.out.println("Default Member :"+c);
		//System.out.println("Private Member :"+d);
		System.out.println("- - - - - -- - - - - - - -- - - - - - -  - - - -- - - - - - -- - -");
	}
		private void Math (char c) {
			System.out.println("Private Members");
			System.out.println("public Member :"+a);
			System.out.println("Protected Member :"+b);
			System.out.println("Default Member :"+c);
			//System.out.println("Private Member :"+d);
			System.out.println("- - - - - -- - - - - - - -- - - - - - -  - - - -- - - - - - -- - -");
		}
		
	 

}
