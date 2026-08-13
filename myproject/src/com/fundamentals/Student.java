package com.fundamentals;

public class Student {

	int student_id;
	String studentname;
	int student_age;
	
	 void hello() {
		System.out.println("welcome to college");
	}

	public static void main(String[] args) {
        System.out.println("main method started");
        Student s1 = new Student();
        s1.hello();
         s1.student_id=8;
         s1.studentname="sai";
         s1.student_age=21;
         System.out.println(s1.student_id);
         System.out.println(s1.studentname);
         System.out.println(s1.student_age);

	}

}
