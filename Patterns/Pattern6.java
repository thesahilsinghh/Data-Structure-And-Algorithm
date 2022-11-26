package com.Patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n - 1;

		while (row <= n) {
			if (row == 1) {
				int i = 1;
				while (i <= n) {
					System.out.print("* ");
					i++;
				}
			}
			// space
			else {
				int i = 1;
				while (i <= row) {
					System.out.print("    ");
					i++;
				}
				// stars
				int j = 1;
				while (j <= star) {
					System.out.print("* ");
					j++;
				}

			}
			System.out.println();
			row++;
			star--;
		}

	}
}
