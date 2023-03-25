package com.Recursion;

public class PrintDecInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		decinc(n);
	}

	public static void decinc(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);
		decinc(n - 1);
		System.out.println(n);
	}

}
