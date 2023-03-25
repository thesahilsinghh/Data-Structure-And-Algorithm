package com.HackerRank;

import java.util.Scanner;

public class Sumofoddplacedandevenplaceddigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		for (int i = 1; n > 0; i++) {

			int rem = n % 10;
			if (i % 2 == 0) {
				even = even + rem;
			}

			else {
				odd = odd + rem;
			}

			n /= 10;

		}
		System.out.println(odd);
		System.out.println(even);

	}

}
