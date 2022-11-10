package com.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] arr = { 876, 234, 55, 67, 2 };
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void swap(int[] arr, int i, int b) {
		int temp = arr[i];
		arr[i] = arr[b];
		arr[b] = temp;

	}

}
