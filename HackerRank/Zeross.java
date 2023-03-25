package com.HackerRank;

import java.util.Scanner;

public class Zeross {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int a = 1;
		int x = 1;
		while (row <= n) {
			int i = 1;
			while (i <= a) {
				System.out.print(x + "\t");
				x++;
				i++;
			}
			row++;
			a++;
			System.out.println();
		}
	}

}
