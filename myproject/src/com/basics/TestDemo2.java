package com.basics;

public class TestDemo2 {

	static void method1() {
		TestDemo2 b = new TestDemo2();
			b.method2();
		System.out.println("method1 called");
	}
	
	 void method2() {
		System.out.println("method2 called");
           method4();

             method3();
             
	 }
	static void method3() {
		System.out.println("method3 called");
		
	}
	 void method4() {
		System.out.println("method4 called");

	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		     method1();
		System.out.println("main method ended");
		

	}

}
