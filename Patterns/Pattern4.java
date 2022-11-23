package com.Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;

		while (row <= n) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= row) {
				System.out.print("* ");
				j++;
			}
			row++;
			space--;
			System.out.println();
		}
	}

}
