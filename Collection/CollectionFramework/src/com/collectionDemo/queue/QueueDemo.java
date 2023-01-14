package com.collectionDemo.queue;

public class QueueDemo {
	
	int queue[] = new int[5];
	
	
	int front=0;
	int rear=-1;
	
	public void enQueue(int element) {
		rear = rear+1;
		queue[rear] = element;
		
		
	}
	
	public void deQueue() {
		System.out.println("Removing element are :"+queue[front++]);
		 
		
	}
	public void disPlay() {
		for (int i = front;i<rear;i++) {
			System.out.println("Elements are : "+queue[i] + "index at-"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueDemo obj = new QueueDemo();
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.enQueue(40);
		obj.enQueue(50);
		obj.disPlay();
		obj.deQueue();
		obj.disPlay();
	}

}
