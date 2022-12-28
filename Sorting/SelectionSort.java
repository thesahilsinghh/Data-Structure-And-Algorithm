package com.Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int p = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[p] > arr[j]) {
					p = j;
				}

			}
			int t = arr[i];
			arr[i] = arr[p];
			arr[p] = t;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
