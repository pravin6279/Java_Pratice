package com.collectionDemo.queue;

public class QueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingArray array= new QueueUsingArray();
		array.enQueue(23);
		array.enQueue(90);
		array.enQueue(93);
		array.enQueue(96);
		array.display();
		array.deQueue();
		array.display();
	}

	int arr[]= new int[10];
	int front=0;
	int rear=-1;
	
	
	public void enQueue(int data) {
		
		rear =rear+1;
		arr[rear]=data;
		
		
	
	}
	public void deQueue() {
		
		System.out.println("Removing rear element from queue" + arr[front++]);
		
	}
	
	public void display() {
		for(int i=front;i<rear;i++) {
			System.out.println(arr[i]);
		}
	}
}
