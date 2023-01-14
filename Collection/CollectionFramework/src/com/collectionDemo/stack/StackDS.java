package com.collectionDemo.stack;

public class StackDS {

	int[] arr = new int[10];
	int top = -1;
	
	void push(int element) {
	  top  = top+1;
	  arr[top]= element;
	}
	void pop(int element) {
		System.out.println("Remove  element is : "+arr[top]);
		top = top-1;
		
	}
	void display() {
		for(int i= 0;i<=top;i++) {
	
			System.out.println("Elememt is :"+arr[i]+" -Index at : "+i);
	
			}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 StackDS obj = new  StackDS ();
		 obj.push(10);
		 obj.push(20);
		 obj.push(30);
		 obj.push(40);
		 obj.push(50);
		 obj.push(60);
		 obj.push(70);
		
		 obj.display();
		


		 
	}

}
