package com.fundamentals.methods;

import java.util.Scanner;

public class Addition {
	
	 void main(String[] args) {
		 System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		 
		System.out.println("enter second value");
        int b=sc.nextInt();
        addition(a,b);
        
        int c=sc.nextInt();
        int d=sc.nextInt();
        subtraction(c,d);
        
        int e=sc.nextInt();
        int f=sc.nextInt();
        multiplication(e,f);

System.out.println("main method ended");
	}

	void addition(int a,int b) {
		System.out.println("addition:"+ (a+b));
	}
	void subtraction(int c,int d) {
		System.out.println("subtraction:"+(c-d));
	}
	void multiplication(int e,int f) {
		System.out.println("result:"+(e*f));
	}
}
