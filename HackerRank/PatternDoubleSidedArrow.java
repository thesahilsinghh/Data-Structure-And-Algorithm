package com.HackerRank;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int spc = 0;
		int val = row;

		while (row <= n) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			int x = val;
			while (j <= star) {
				System.out.print(x + " ");
				j++;
				x--;
			}

			if (row > 1 && row < n) {

				// space
				int l = 1;
				while (l < spc) {
					System.out.print("  ");
					l++;
				}

				//
				int o = 1;
				int v = 1;
				while (o <= star) {
					System.out.print(v + " ");
					o++;
					v++;
				}

			}

			if (row < n / 2 + 1) {

				space -= 2;
				star++;
				spc += 2;
				val++;
			} else {
				space += 2;
				star--;
				spc -= 2;
				val--;
			}

			System.out.println();
			row++;

		}

	}

}
