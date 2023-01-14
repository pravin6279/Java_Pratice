package com.collectionDemo.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,3,4,12,15,45,65,78};
		int search = 65;
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		
		System.out.println("binary search");
		while  (li<=hi) {
			if(arr[mi]==search) {
				System.out.println("Element Found at "+mi+" Position");
				break;
			}
			else if(arr[mi]<search) {
				li =mi+1;
			
			}
			else {
				hi = mi-1;
				
			}
			mi = (li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element in not present");
		}

	}

}
