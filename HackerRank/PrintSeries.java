package com.HackerRank;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int i = 1;
		for (int row = 1; row <= n; row++) {

			int x = 3 * i + 2;
			if (x % s == 0) {
				i++;
				x = 3 * i + 2;
				System.out.println(x);
				i++;
			} else {
				System.out.println(x);
				i++;
			}
		}

	}

}
