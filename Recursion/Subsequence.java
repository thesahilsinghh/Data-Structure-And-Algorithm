package com.Recursion;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		subsqnce(str, "");
	}

	public static void subsqnce(String ques, String ans) {
		// TODO Auto-generated method stub

		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);
		subsqnce(ques.substring(1), ans);
		subsqnce(ques.substring(1), ans + ch);

	}

}
