package com.fundamentals;

public class Studentobject {

	Integer studentid;
	String name;
	
	 static String gender;
	static String branch;
	static String collegename;

	void display() {
		System.out.println("studentid:" + studentid);
		System.out.println("name:" + name);
	}
	
	static void displaydetails() {
		System.out.println("gender:" + gender);
		System.out.println("branch:" + branch);
		System.out.println("collegename:" + collegename);

	}

	public static void main(String[] args) {

		Studentobject s = new Studentobject();
		Studentobject s1 = new Studentobject();
		
		gender = "femal";
		branch = "CSE";
		collegename = "DNR";


		s.studentid = 101;
		s.name = "yesu";
		

		s1.studentid = 102;
		s1.name = "paparao";
		
		s.display();
		displaydetails();
		System.out.println("********************");
		s1.display();
		displaydetails();
	}

}
