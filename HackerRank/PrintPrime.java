package com.HackerRank;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;

		while (i <= n) {
			int f = 1;
			int k = 2;
			if (i != k) {

				while (k < i) {
					if (i % k == 0) {
						f++;
						break;
					} else
						k++;
				}
			}
			if (f >= 2) {
				i++;
			} else {
				System.out.println(i);
				i++;
			}

		}

	}

}
