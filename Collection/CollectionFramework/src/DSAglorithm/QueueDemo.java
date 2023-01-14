package DSAglorithm;

public class QueueDemo {
	int arr[] = new int[10];
	
	int rear = -1;
	int front = 0;
	
	
	public void enqueue(int element) {
		rear = rear+1;
		arr[rear] = element;
		
	}
	
	public void dequeue() {
		System.out.println("Remove an element:"+arr[front++]);
		
	}
	
	public void display() {
		
		for(int i=front;i<rear;i++) {
			System.out.println("The element is :"+arr[i] +" "+i+" :Position");
		}
	}
	

	public static void main(String[] args) {
		
		QueueDemo obj = new QueueDemo();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.display();
		obj.dequeue();
		obj.display();
		
		
	}

}
