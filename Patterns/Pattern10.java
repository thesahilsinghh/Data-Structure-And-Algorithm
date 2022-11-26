package com.Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		int star = 2 * n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// stars
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			row++;
			star -= 2;
			space++;
			System.out.println();
		}
	}

}
