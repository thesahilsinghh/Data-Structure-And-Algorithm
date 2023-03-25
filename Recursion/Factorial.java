package com.Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		System.out.println(factorial(n));
	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		}

		int fn = factorial(n - 1);

		return n * fn;

	}

}
