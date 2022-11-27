package com.Patterns;

import java.util.Scanner;

public class Patternodnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int x = 1;
		int l = 2 * n - 1;
		while (row <= n) {

			// stars(odd)
			while (x <= l) {
				int i = 1;
				while (i <= x) {
					System.out.print("* ");
					i++;
				}
				System.out.println();
				x = x + 2;
			}
			row++;
		}

	}

}
