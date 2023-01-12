package com.HackerRank;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;

		int row = 1;
		int spc = n - 2;
		while (row <= n) {
			int i = 1;
			// space
			while (i <= space) {
				System.out.print(" ");
				i++;
			}

			// first n last loop
			if (row == 1 || row == n) {
				int j = 1;
				while (j <= n) {
					System.out.print("*");
					j++;
				}
			}

			// middle
			else {
				System.out.print("*");
				int k = 1;
				while (k <= spc) {
					System.out.print(" ");
					k++;
				}
				System.out.print("*");
			}

			row++;
			space--;
			System.out.println();
		}

	}

}
