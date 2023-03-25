package com.HackerRank;

import java.util.Scanner;

public class PatterRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int v = row;
		while (row <= 2 * n - 1) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print(" \t");
				i++;
			}

			// star
			int val = v;
			int k = 1;
			while (k <= star) {
				if (k < (star / 2) + 1) {
					System.out.print(val + "\t");
					val++;

				}

				else {
					System.out.print(val + "\t");
					val--;
				}
				k++;

			}
			if (row < n) {
				space--;
				star += 2;
				v++;
				

			} else {
				space++;
				star -= 2;
				v--;
			}

			System.out.println();
			row++;

		}

	}

}
