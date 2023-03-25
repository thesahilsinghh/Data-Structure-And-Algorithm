package com.HackerRank;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 1;
		int v= n;

		while (row <= 2 * n + 1) {

			// stars
			int val = n;
			int i = 1;
			while (i <= star) {
				System.out.print(val + " ");
				i++;
				val--;
			}

			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// starr
			int r= v;
			int k = 1;
			if(row==n+1) {
				k++;
				r++;
			}
			while (k <= star) {
				System.out.print(r + " ");
				k++;
				r++;;
			}

			if (row < n + 1) {

				star++;
				space -= 2;
				v--;

			}

			else {
				star--;
				space += 2;
				v++;

			}

			System.out.println();
			row++;

		}

	}

}
