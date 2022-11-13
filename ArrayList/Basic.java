package com.ArrayList;

import java.util.*;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> List = new ArrayList<>();

		// add
		List.add(10);
		System.out.println(List);

		List.add(20);
		List.add(20);
		List.add(1, 30);
		System.out.println(List);

		// set
		List.set(3, 34);
		System.out.println(List);
		System.out.println(List.size());

		// remove

		System.out.println(List.remove(3));
		System.out.println(List);

		// sort

		Collections.sort(List);
		System.out.println(List);
		Collections.reverse(List);
		System.out.println(List);
	}
}
