package com.Strings;

import java.util.Iterator;

public class Substring {

	public static void main(String[] args) {

		String str = "abcd";
		System.out.println(str.substring(3,4));
		substrng(str);
	}

	public static void substrng(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
