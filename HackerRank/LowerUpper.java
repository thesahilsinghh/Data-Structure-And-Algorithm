package com.HackerRank;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		int i = (char) (n);

		if (i >= 65 && i <= 90) {
			System.out.println("UPPERCASE");
		} else if (i >= 97 && i <= 122) {
			System.out.println("LOWERCASE");
		} else {
			System.out.println("Invalid");
		}

	}

}
