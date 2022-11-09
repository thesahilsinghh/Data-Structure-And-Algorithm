package com.Arrays;

public class Minimum {

	public static void main(String[] args) {
		int[] arr = { 65, 23, 53, -98, -48, 77, 23 };
		System.out.println(min(arr));
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}
}
