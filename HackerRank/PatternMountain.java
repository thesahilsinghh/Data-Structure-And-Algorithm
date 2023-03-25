package com.HackerRank;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = 2*n - 3;
		int row = 1;
		while (n >= row) {

			// stars
			int i = 1;
			while (i <= star) {
				System.out.print(i + "\t");
				i++;
			}

			// space
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}

			// stars;
			int k = 1;
			int x = row;
			if (row == n) {
				k ++;
				x--;
			}
			while (k <= star) {

				System.out.print(x + "\t");
				k++;
				x--;
			}

			space -= 2;
			star++;
			row++;
			System.out.println();

		}
	}

}
