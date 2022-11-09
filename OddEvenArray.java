package com.Arrays;

public class OddEvenArray {

	public static void main(String[] args) {
		int[][] arr = { { 13, 5, 56, 4 }, { 9, 6, 4, 8 }, { 32, 68, 3, 65 } };
		oddeven(arr);
	}

	public static void oddeven(int[][] arr) {
		int l = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}

			else {

				for (int j = l; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}

			System.out.println();
		}

	}

}
