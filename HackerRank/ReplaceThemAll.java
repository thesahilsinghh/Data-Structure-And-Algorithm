package com.HackerRank;

import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long i = 1;

		while (n > 0) {

			long rem = n % 10;
			if (rem == 0) {

				ans = ans + (5 * i);
			} else {

				ans = ans + rem * i;
			}
			i *= 10;
			n /= 10;

		}
		System.out.println(ans);
	}

}
