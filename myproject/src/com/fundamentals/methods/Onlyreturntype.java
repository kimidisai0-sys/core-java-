package com.fundamentals.methods;

import java.util.Scanner;

public class Onlyreturntype {

	Scanner sc = new Scanner(System.in);

	double salary() {
		System.out.println("enter your salary");
		double sal = sc.nextDouble();
		return sal;
	}

	double bons() {
		System.out.println("enter your bonus");
		double bons = sc.nextDouble();
		return bons;
	}

	double hra() {
		System.out.println("enter your hra");
		double h = sc.nextDouble();
		return h;
	}

	public static void main(String[] args) {
		Onlyreturntype o = new Onlyreturntype();

		System.out.println("main method started");

		double sal = o.salary();
		System.out.println("basic salary:" + sal);

		double a = o.bons();
		System.out.println("basic bons:" + a);

		double h = o.hra();
		System.out.println("basic hra:" + h);
		System.out.println("**************************");

		System.out.println("total sal:" + (sal + a + h));
		System.out.println("total sal:" + (++sal + ++a + ++h));

	}

}
