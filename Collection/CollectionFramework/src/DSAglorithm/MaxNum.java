package DSAglorithm;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {63,45,76,98,99,1001,3567,9876};
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
			
		}
		System.out.println("Maximum number is :"+max);
	}

}
