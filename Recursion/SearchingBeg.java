package com.Recursion;

public class SearchingBeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 3, 5, 6, 3, 7, 3, 8, 6, 9 };
		System.out.println(Frst(arr, 0, 9));
	}

	public static int Frst(int[] arr, int a, int b) {

		if(arr[a]==arr.length) {
			return -1;
		}
		
		if(arr[a]==b) {
			return a;
		}
		
		
		return Frst(arr, a+1, b);
	}

}
