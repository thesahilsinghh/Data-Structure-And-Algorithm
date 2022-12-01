package com.Strings;

import java.util.Scanner;

public class Playing_with_GoodStrings {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		goodstring(n);
	}

	public static void goodstring(String n) {

		int count =0;
		int ans=0;
		
		for (int i = 0; i < n.length(); i++) {
			
			if(vowels(n.charAt(i))==true) {
				count++;
			}
			
			else {
				ans= Math.max(ans, count);
				count=0;
			}
		
			ans=Math.max(ans, count);
		}
	
		System.out.println(ans);
	}
	
	public static boolean vowels(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		
		return false;
		}
}
