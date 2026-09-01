package com.fundamentals.methods;

public class Demo1 {

	public static void main(String[] args) {

		Demo1 d = new Demo1();
		System.out.println("main method started");

		welcome();
		d.hello();
		d.getNumber();

		System.out.println("main method ended");

	}

	public static void welcome() {
		System.out.println("welcome to v cube");
	}

	void hello() {
		System.out.println("hello guys");

	}

	Integer getNumber() {
		return 100;
	}
}
