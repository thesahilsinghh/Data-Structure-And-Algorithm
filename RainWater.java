package com.Arrays;

public class RainWater {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 0, 1, 2, 1 };
		space(arr);
	}

	public static void space(int[] arr) {
		int n = arr.length;
		int[] lft = new int[n];
		int[] rgt = new int[n];

		lft[0] = arr[0];

		for (int i = 1; i < n; i++) {

			lft[i] = Math.max(arr[i], lft[i - 1]);

		}

		rgt[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {

			rgt[i] = Math.max(arr[i], rgt[i + 1]);
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			ans = ans + (Math.min(lft[i], rgt[i]) - arr[i]);
		}

		System.out.println(ans);

	}
}
