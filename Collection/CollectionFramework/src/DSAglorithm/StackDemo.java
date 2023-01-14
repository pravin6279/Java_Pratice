package DSAglorithm;

public class StackDemo {

	int arr[] = new int[10];
	
	int top = -1;
			
	public void push(int element) {
		top  = top+1;
		arr[top] = element;
	}
	
	public void pop() {
		System.out.println("Remove the element "+arr[top]);
		top = top-1;
	}
	
	public void display() {
		for(int i = 0;i<=top;i++) {
			System.out.println("The element are :"+arr[i]+" " +i+" :Position");
		}
	}
	public static void main(String[] args) {
		StackDemo obj  = new StackDemo();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.display();
		
		obj.pop();
		obj.display();

	}

}
