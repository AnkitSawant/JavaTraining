package com.ct.day2.Assignment;


class Student2 {
	public static int count = 0;
	Student2() {
		count++;
	}
}
public class ObjectCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		Student2 s4 = new Student2();
		System.out.println(Student2.count);
	}

}
