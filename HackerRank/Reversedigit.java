package com.HackerRank;

import java.util.Scanner;

public class Reversedigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			System.out.print(rem);
			n = n / 10;

		}

	}
}
