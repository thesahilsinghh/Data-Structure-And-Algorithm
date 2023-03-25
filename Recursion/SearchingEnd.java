package com.Recursion;

import java.util.Scanner;

public class SearchingEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int b= sc.nextInt();
		
		System.out.println(end(arr, arr.length-1, b));

	}

	public static int end(int[] arr, int a, int b) {
		if(a==-1) {
			return -1;
		}
		
		if(arr[a]==b) {
			return a;
		}
		
		return end(arr, a-1, b);
	
	}
}
