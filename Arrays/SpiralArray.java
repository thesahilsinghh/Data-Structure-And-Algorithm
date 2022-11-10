package com.Arrays;

public class SpiralArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiral(arr);
	}

	public static void spiral(int[][] arr) {

		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int totalel = arr.length * arr[0].length;
		int count = 0;
		while (count < totalel) {

			for (int j = minc; j <= maxc && count < totalel; j++) {

				System.out.print(arr[minr][j] + " ");
				count++;
			}

			minr++;

			for (int j = minr; j <= maxr && count < totalel; j++) {
				System.out.print(arr[j][maxc] + " ");
				count++;
			}

			maxc--;

			for (int j = maxc; j >= minc && count < totalel; j--) {
				System.out.print(arr[maxr][j] + " ");
				count++;
			}

			maxr--;

			for (int j = maxr; j >= minr && count < totalel; j--) {
				System.out.print(arr[j][minc] + " ");
				count++;
			}
			minc++;
		}
	}

}
