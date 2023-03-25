package com.OopsLec1;

public class StudentFill {

	public static void main(String[] args) {

		Student s = new Student();
		s.age = 18;
		s.name = "Nisha";

		System.out.println(s.age);
		System.out.println(s.name);
		s.hello();

		Student s1 = new Student();
		s1.age = 22;
		s1.name = "adesh";
		s1.hello();
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;");
		
		addchnge(s1, s);
		System.out.println("name "+ s.name+s.age);
		System.out.println("name "+ s1.name+s1.age);

	}

	public static void addchnge(Student s1, Student s) {

		int t = s.age;
		s.age = s1.age;
		s1.age = t;
	}
}
