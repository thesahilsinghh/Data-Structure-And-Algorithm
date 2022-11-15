package com.BinaryndDcecimals;

public class DecimalstoBinary {

	public static void main(String[] args) {

		int n = 45;
		int m = 1;
		int a = 0;
		while (n > 0) {

			int rem = n % 2;
			a = a + rem * m;
			m = m * 10;
			n = n / 2;

		}
		System.out.println(a);
	}

}
