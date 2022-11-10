package com.Arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr);
		for (int q = 0; q < arr.length; q++) {
			System.out.println(arr[q]);
		}
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		for (int k = 1; k <= (arr.length) / 2; k++) {
			int o = arr[i];
			arr[i] = arr[j];
			arr[j] = o;

			i++;
			j--;
		}

		
	}

}
