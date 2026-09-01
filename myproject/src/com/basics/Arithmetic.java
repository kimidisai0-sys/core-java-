package com.basics;

public class Arithmetic {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 554;
		
		boolean bo=true;
			if(a>b && a>c) {
			System.out.println("A is big number");
				if(b>c && b>a)
				System.out.println("b is big number");
           
		}else {
			System.out.println(" c is big number");

		}

		System.out.println(a + b);
		System.out.println(a + c);
		System.out.println(b + c);
		
		System.out.println(a-b);
		System.out.println(b-c);
		System.out.println(c-a);

		System.out.println(a * b);
		System.out.println(a * c);
		System.out.println(c * b);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
	


	}

}
