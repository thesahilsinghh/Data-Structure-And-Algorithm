package com.Strings;

public class Palidrom {

	public static void main(String[] args) {

		String str = "Nitin";
		System.out.println(palidrom(str));
	}

	public static boolean palidrom(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {

				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
