package com.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = sc.nextInt();
		System.out.println(binary(arr, n));
	}

	public static int binary(int[] arr,int n) {
		int low = 0;
		int high=arr.length-1;
		
		
		while(low<=high){
			int md=(low+high)/2;
			
			
			if(n==arr[md]) {
				return md;
			}
			
			else if(n<arr[md]) {
				high=md-1;
				
			}
			
			
			else if(n>arr[md]) {
				low=md+1;
			}
		}
		
	return -1;
	}

}
