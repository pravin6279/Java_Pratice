package com.Inheritance.Demo;

public class Child extends Parent {
	public void Eat() {
		System.out.println("he is eating bread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Child obj = new Child(); obj.Fight(); obj.Eat();
		 */
		
		Parent obj1 = new Child();
		obj1.Eat();
		
		
	}

}
