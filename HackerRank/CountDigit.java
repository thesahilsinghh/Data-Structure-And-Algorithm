package com.HackerRank;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int c = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			if (rem == n2) {
				c++;
			}
			n1 = n1 / 10;
		}
		System.out.println(c);
	}

}
