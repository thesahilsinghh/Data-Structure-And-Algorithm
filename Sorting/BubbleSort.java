package com.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Inc(arr);
		
		
	}

	public static void Inc(int[] arr) {
		
		
		for(int i =1;i<arr.length;i++) {
			
			for(int l= 0;l<arr.length-i;l++) {
				
				if(arr[l]>arr[l+1]) {
					int temp=arr[l];
					arr[l]=arr[l+1];
					arr[l+1]=temp;
				}
				
			}
			
		
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
