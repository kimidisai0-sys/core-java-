package com.fundamentals;

public class Student1 {

	String sname = "sai";
	byte age = 21;
	short addmissionyear = 2023;
	int rollno = 508;
	long pno = 8374092356l;
	float attendance = 75.5f;
	double totalfee = 120000.00;
	char grade = 'A';
	boolean status = true;
	long sid = 23950508l;
	double feepaid = 82500.0;

	void display() {
		System.out.println("name:" + sname);
		System.out.println("age:" + age);
		System.out.println("addmissionyear:" + addmissionyear);
		System.out.println("rollno:" + rollno);
		System.out.println("pno:" + pno);
		System.out.println("attendance:" + attendance);
		System.out.println("totalfee:" + totalfee);
		System.out.println("grade:" + grade);
		System.out.println("status:" + status);
		System.out.println("sid:" + sid);
		System.out.println("feepaid:" + feepaid);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println("**********display student details*********");
		s1.display();
		
	}

}
