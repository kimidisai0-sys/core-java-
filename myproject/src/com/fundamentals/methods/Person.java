package com.fundamentals.methods;

import java.util.Scanner;

public class Person {

	void main(String[] args) {

		System.out.println("main method started");

		int c=multiplication();
		System.out.println("result:"+c);
		
		int f =multiply();
		System.out.println("result:"+f);
		
		double g=addition();
		System.out.println(g);

		System.out.println("main method ended");

	}

	

	int multiplication() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a * b;
		
	}
	
	int multiply() {
		int d=10;
		int e=20;
		return d*e;
	}
double addition() {
	Scanner sc = new Scanner(System.in);

	double a = sc.nextDouble();
	double b = sc.nextDouble();
	return a+b;
}
	
}
