package com.Arrays;

public class ProductofOthers {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 4 };
		Product(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Product(int[] arr) {
		int n = arr.length;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		arr1[0] = 1;
		arr2[n - 1] = 1;
		for (int i = 1; i < n; i++) {

			arr1[i] = arr1[i - 1] * arr[i - 1];

		}
		for (int i = n - 2; i >= 0; i--) {

			arr2[i] = arr2[i + 1] * arr[i + 1];

		}

		for (int i = 0; i < n; i++) {

			arr[i] = arr1[i] * arr2[i];

		}

	}
}
