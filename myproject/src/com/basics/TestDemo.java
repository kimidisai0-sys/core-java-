package com.basics;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
      System.out.println("main method");
      System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
      System.out.println(Class.forName("com.mysql.cj.Result"));
	}

}
