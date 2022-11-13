package com.ArrayList;

import java.util.*;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());

		}

		ArrayList<Integer> listt = new ArrayList<>();

		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			listt.add(sc.nextInt());

		}

		ArrayList<Integer> listtt = new ArrayList<>();
//		int a = list.size() - 1;
//		int b = listt.size() - 1;
//		int p=0;
//		for (int i = 0; i < x; i++) {
//			int f;
//			if(a>=0) {
//			f= list.get(a);
//			System.out.println(f);
//			}
//			else {
//				f=0;
//			}
//			int g;
//			if(b>=0) {
//				g= listt.get(b);
//				System.out.println(g);
//				}
//				else {
//					g=0;
//				}
//			
//			
//			int w=f+g+p;
//			
//			
//			listtt.add(0,w%10);
//			p=w/10;
//			a--;
//			b--;
//		}
//	 System.out.println(listtt);

		// monu sir method
		int a = list.size() - 1;
		int b = listt.size() - 1;
		int p = 0;

		while (a > 0 || b >= 0) {

			int sum = 0;
			if (a >= 0) {
				sum += a;
				a--;
			}
			if (b >= 0) {
				sum += b;
				b--;
			}
			sum+=p;
			listtt.add(0, sum % 10);
			p=sum/10;
			
			
		}
		
		System.out.println(listtt);

	}

}
