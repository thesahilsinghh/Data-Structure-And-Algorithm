package com.Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  5;  	//sc.nextInt();
		int row = 1;
		int star = n;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			star--;
			row++;
		}
	}

}
