package com.collectionDemo.stack;

public class StackDemo1 {
	int arr [] = new int[10];
	
	int top = -1;
	
	void push(int element) {
		top = top+1;
		arr[top] = element;
		
	}
	void pop(int elment) {
		System.out.println("remove element:"+arr[top]);
		top = top-1;
		
	}
	void display() {
		for (int i=0;i<=top;i++) {
			System.out.println("element:"+arr[i]+" :At index="+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo1 obj = new StackDemo1();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.display();
		obj.pop(50);
		obj.display();
	}

}
