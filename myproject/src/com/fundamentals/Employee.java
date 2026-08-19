package com.fundamentals;

public class Employee {

	short emid;
	String emname;
	int sal;
	byte experience;
	char grade;
	boolean status;

	void display() {
		System.out.println("emid:" + emid);
		System.out.println("emname:" + emname);
		System.out.println("sal:" + sal);
		System.out.println("experience:" + experience + "years");
		System.out.println("grade:" + grade);
		System.out.println("status:" + status);
  
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();


		e1.emid = 1001;
		e1.emname = "yesu";
		e1.sal = 30000;
		e1.experience = 5;
		e1.grade='A';
		e1.status=true;
        e1.  display();
        System.out.println("--------------------------------");
        
        e2.emid = 1002;
		e2.emname = "paparao";
		e2.sal = 40000;
		e2.experience = 7;
		e2.grade='b';
		e2.status=true;
        e2.  display();
        System.out.println("--------------------------------");
        
        e3.emid = 1003;
		e3.emname = "murali";
		e3.sal = 50000;
		e3.experience = 4;
		e3.grade='A';
		e3.status=true;
        e3.  display();
        System.out.println("--------------------------------");
	}

}
