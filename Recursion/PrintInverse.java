package com.Recursion;

public class PrintInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		inv(n);
	}

	public static void inv(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);
		
		inv(n - 1);
		
	}

}
