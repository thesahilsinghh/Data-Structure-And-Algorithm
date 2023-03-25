package com.OopsLec1;

public class Constructor {

	String name;
	int age;

	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void print() {
		System.out.println(this.name + " " + this.age);
	}
}
