package com.BinaryndDcecimals;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1;
		int a = 0;
		while (n > 0) {

			int rem = n % 10;
			a = a + rem * m;
			m = m * 2;
			n = n / 10;
 
		}
		System.out.println(a);

	}

}
