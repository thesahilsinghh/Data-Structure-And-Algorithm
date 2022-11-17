package com.functions;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = count(n);
		System.out.println(Armstrong(n, c));

	}

	public static int count(int a) {
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}
		return count;
	}

	public static boolean Armstrong(int n, int c) {

		int add = 0;
		int temp = n;
		while (n > 0) {

			int rem = n % 10;
			add = (int) (add + Math.pow(rem, c));
			n /= 10;
		}

		if (add == temp) {
			return true;

		} else {
			return false;
		}

	}

}
