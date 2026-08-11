package com.basics;

public class employe {

	
	static {
		System.out.println("static block called ");

	}
	{
	    System.out.println("instance block called ");
		}
	
	public static void main(String[] args) {
		
		System.out.println("main method started ");
		System.out.println("main method ended");
		employe em = new employe();

	}

}
