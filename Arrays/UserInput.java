package com.Arrays;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}

}
