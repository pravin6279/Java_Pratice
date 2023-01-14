package DSAglorithm;

public class LinearSearch {
	public static void main(String[] args) {
		
		int arr[] = {3,6,45,87,56,86,98};
		
		int search = 86;
		int temp = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(search +" " +"Element found at "+i+ " index");
				temp = temp+1;
				break;
			}
		}
		if(temp ==0) {
			System.out.println("Element not found");
		}
	}

}