package com.HackerRank;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(DecimaltoOctal(n));

	}

	public static int DecimaltoOctal(int n) {

		int m = 1;
		int a = 0;
		while (n > 0) {

			int rem = n % 8;
			a = a + rem * m;
			m = m * 10;
			n = n / 8;

		}
		return a;
	}

}
