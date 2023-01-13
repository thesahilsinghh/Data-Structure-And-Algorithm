package com.HackerRank;

import java.util.Scanner;

public class MirrorStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n / 2 + 1;
		int star = 1;
		int row = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < n / 2 + 1) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
