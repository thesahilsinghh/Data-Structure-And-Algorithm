package com.HackerRank;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int rem = 1;
		while (rem > 0) {

			rem = n % n1;
			int i = n / n1;
			n = n1;
			n1 = rem;

		}
		System.out.println(n);
	}

}
