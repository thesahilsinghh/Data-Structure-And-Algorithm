package com.Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
	//	int n = sc.nextInt();
		int n=5;
		int row = 1;

		while (row <= n) {
			int star = 1;
			while (star <= row) {
				System.out.print("* ");
				star++;
			}
			System.out.println();
			row++;
		}

	}

}
