package com.Arrays;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}

		int x = sc.nextInt();
		
		
		System.out.println(search(arr, x));
	}

	public static int search(int[][] arr, int x) {

		int row = 0;
		int col = arr[0].length - 1;

		while (col >= 0 && row < arr.length) {

			if(arr[row][col]==x) {
				return 1;
			}
			
			else if(arr[row][col]<x) {
				row++;
			}
			
			else {
				col--;
			}
		}
		
		return 0;

	}

}
