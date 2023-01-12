package com.HackerRank;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		int star = 2 * n + 1;
		int x=n;
		while (row <= 2 * n + 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// stars
			int j = 1;
			while (j <= star) {
				if(x>0) {
				System.out.print(x+" ");
				
				x--;
				}
				else {
					System.out.print(x+" ");
					
					x=n;
				}
			j++;
			}
			if (row < n + 1) {
				star -= 2;
				space++;
			}
			else {
				star+=2;
				space--;
			}
			row++;
			System.out.println();
		}

	}

}
