package com.functions;

public class Function2 {

	public static void main(String[] args) {

		System.out.println("xxx");
		int a = 12;
		int b = 898;
		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println("uuu");
	}

	public static int add(int a, int b) {

		int c = a + b;
		return c;

	}
	
	public static int sub(int a, int b) {
		int c= a-b;
		return c;
	}
}
