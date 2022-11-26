package com.Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int row = 1;
		int star = n;
		int space = n - 2;

		while (row <= n) {
			if (row == 1 || row == n) {

				int i = 1;
				while (i <= n) {
					System.out.print("*" + " ");
					i++;
				}
			} else {
				System.out.print("*" + " ");
				int k = 1;
				while (k <= space) {
					System.out.print("  ");
					k++;
				}
				System.out.print("*" + " ");
			}

			row++;
			System.out.println();
		}
	}
}
