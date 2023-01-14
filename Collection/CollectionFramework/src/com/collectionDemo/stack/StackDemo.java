package com.collectionDemo.stack;

public class StackDemo {
	
	int [] arr  = new int[10];
	
	int top = -1;
	
	void Push(int element) 
	{
		top= top+1;
		arr[top] = element;
		
	}
	
	void Pop() {
		System.out.println("Remove element" + arr[top]);
		top = top-1;
	}
	
	void Display(){
		for (int i = 0;i<=top;i++) {
			System.out.println("element:" + arr[i] + " :index :"+ i );
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackDemo obj = new StackDemo();
		obj.Push(10);
		obj.Push(20);
		obj.Push(30);
		obj.Display();
		obj.Pop();
		obj.Display();
		/*
		 * obj.Pop(); obj.Display();
		 */		
		
	}

	
}
