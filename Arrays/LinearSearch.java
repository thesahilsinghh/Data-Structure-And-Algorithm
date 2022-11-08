package com.Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int [] arr= new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int n= sc.nextInt();
		System.out.println(Lsearch(arr, n));
		
	}
	
	public static int Lsearch(int []arr,int n) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
				
				
			}
		}
		return -1;
	}

}
