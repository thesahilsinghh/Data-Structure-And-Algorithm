package com.HackerRank;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int spc = -1;
		//int starr=0;
		while (row <= n) {

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			
			int l=1;
			while(l<=spc) {
				System.out.print("  ");
				l++;
			}
			int b=1;
			if(row!=1||row!=n) {

				while(b<=star) {
					System.out.print("* ");
					b++;
					}	
			}
			
			
		
			if(row<n/2+1) {
				space-=2;
				star++;
			
				spc+=2;
			}
			else {
				space+=2;
				star--;
				
				spc-=2;
			}
			row++;
			System.out.println();
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
