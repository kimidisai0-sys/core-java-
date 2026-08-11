package com.basics;

public class Laptop {
	String name="DELL";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
void m1() {
	System.out.println("mi called");
	Laptop l2 = new Laptop();
	System.out.println(l2.name);

}
	public static void main(String[] args) {
		System.out.println("main method started");
		Laptop l1 = new Laptop();
		System.out.println(l1);
		Laptop l2 = new Laptop();
		System.out.println(l2);
		
		l2=l1;
      new Laptop().m1();
System.gc();

	}

}
