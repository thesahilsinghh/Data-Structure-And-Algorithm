package com.lec4;

import java.util.Scanner;

public class Prime_nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 1;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				f++;
			}
		}
		if (f > 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
