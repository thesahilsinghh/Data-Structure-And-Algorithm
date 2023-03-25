package com.HackerRank;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if ((n1 + n2) > 0) {
			int a = n1 + n2;
			int n3 = sc.nextInt();
			if ((n3 + a) < 0) {
				System.out.println(n1);
				System.out.println(n2);

			} else {
				a = a + n3;
				int n4 = sc.nextInt();
				if ((n4 + a) < 0) {
					System.out.println(n1);
					System.out.println(n2);
					System.out.println(n3);

				} else {
					a = a + n4;
					int n5 = sc.nextInt();
					if ((n5 + a) > 0) {
						System.out.println(n1);
						System.out.println(n2);
						System.out.println(n3);
						System.out.println(n4);
						System.out.println(n5);
					}
				}

			}

		}
	}
}
