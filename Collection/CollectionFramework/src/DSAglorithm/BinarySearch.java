package DSAglorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,34,56,67,78,81,85,93,95};
		int search = 85;
		int li = 0;
		int hi = arr.length-1;
		int mi  = (li+hi)/2;
		
		
		while(li<=hi) {
			if(arr[mi]==search) {
				System.out.println("Element found sucessfully :"+mi);
				break;
			}
			else if(arr[mi]<search) {
				li  = mi+1;
			}
			else {
				hi  = mi-1;
				
			}
			mi= (li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element in not present");
		}
	}

}
