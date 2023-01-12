package com.HackerRank;

import java.util.Scanner;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n / 2 + 1;
		int row = 1;
		int space = -1;

		while (row <= n) {

			// star1
			int i = 1;
			while (i <= star) {
				System.out.print("*\t");
				i++;
			}

			// space
			int j = 1;
			while (j <= space) {
				System.out.print(" \t");
				j++;
			}
			int k = 1;
			if (row == 1 || row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("*"+"\t");
				k++;
			}

			if (row < n / 2 + 1) {
				star--;
				space+=2;

			} else {
				star++;
				space-=2;
			}
			System.out.println();
			row++;

		}

	}

}
