package com.Polymorphism.Demo;

import java.util.Scanner;

class Result {
public static void main(String[] args){
	int sum = 0;
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the Element you want");
    int n = sc.nextInt();
    int arr[]=new int[n];
    
    System.out.println("Enter the Element ");
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        sum = sum+arr[i];
        
    }
    System.out.println(sum);
}    
     
}
    	