package com.fundamentals;

public class Testdemo1 {

	byte b = (byte) 257;
	short s = (short)4375683;
	int i = 4678456;
	long l = 43246576;
	float f = 4634.5f;
	double d = 4633.43254;
	char c='a';
	boolean bo = true;

	public static void main(String[] args) {

		Testdemo1 t1 = new Testdemo1();

		System.out.println("byte=" + t1.b);
		System.out.println("short=" + t1.s);
		System.out.println("int=" + t1.i);
		System.out.println("long=" + t1.l);
		System.out.println("float=" + t1.f);
		System.out.println("double=" + t1.d);
		System.out.println("char=" + t1.c);
		System.out.println("boolean=" + t1.bo);

	}

}
