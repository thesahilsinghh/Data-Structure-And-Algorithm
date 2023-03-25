package com.HackerRank;

public class PatternMagic {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = -1;
		while (row < 2 * n) {
			if (row == 1 || row == 2 * n - 1) {
				int i = 1;
				while (i <= 2 * n - 1) {
					System.out.print("*");
					i++;
				}
			}

			else {
				int k = 1;
				while (k <= star) {
					System.out.print("*");
					k++;
				}
				int l = 1;
				while (l <= space) {
					System.out.print(" ");
					l++;
				}
				int o = 1;
				while (o <= star) {
					System.out.print("*");
					o++;
				}

			}
			
			if(row<n) {
				
				star--;
				space+=2;
			}
			else {
				
				star++;
				space-=2;
			}
			row++;
			System.out.println();
			
			
		}
	}

}
