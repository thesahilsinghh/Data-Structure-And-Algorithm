package com.Arrays;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}

		Max(arr);
	}

	public static void Max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
			max = arr[i];
			}

		}
		System.out.println(max);
	}
}
