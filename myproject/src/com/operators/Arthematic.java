package com.operators;

import java.util.Scanner;

// Arithmetic operators
//+ - * \ %

public class Arthematic {

	Scanner sc = new Scanner(System.in);

	int addition(int a, int b) {

		int sum = a + b;
		return sum;
	}

	double subtraction(double a, double b) {
		double d = a - b;
		return d;
	}

	double multiplication(double a, double b) {
		double product = a * b;
		return product;
	}

	public static void main(String[] args) {

		int a1 = 10;
		int b1 = 20;
		System.out.println("sum:" + (a1 + b1));
		System.out.println("difference:" + (b1 - a1));
		System.out.println("product:" + a1 * b1);

		int a2 = 88;
		int b2 = 3;
		System.out.println("quacient:" + a2 / b2);
		System.out.println("remainder:" + a2 % b2);

		Arthematic a = new Arthematic();

		int c = a.addition(10, 50);
		System.out.println("sum:" + c);

		double d1 = a.subtraction(33.3, 43.6);
		System.out.println("difference:" + d1);

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number");
		double d = sc.nextDouble();
		System.out.println("enter first number");
		double d2 = sc.nextDouble();
		double product = a.multiplication(d, d2);
		System.out.println("product:"+product);
	}

}
