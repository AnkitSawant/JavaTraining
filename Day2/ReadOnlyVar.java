package com.ct.day2.Assignment;

class Student1 {
	private int studentId;
	
	Student1() {
		studentId = 4;
	}
	Student1(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}	
	
}
public class ReadOnlyVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(5);
		System.out.println(s.getStudentId());

	}

}
