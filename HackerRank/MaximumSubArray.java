package com.HackerRank;

import java.util.Iterator;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1,-5,4 };
		System.out.println(maxsum(arr));
		
	}

	public static int maxsum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int prev =0;
			
			for (int j = i; j < arr.length; j++) {
				prev+=arr[j];
				ans=Math.max(ans, prev);
			}
		}
		
		return ans;
		
		
	}
}
