package com.fundamentals;

public class Movie1 {
	
	String moviename;
	int relesedyear;
	int ticketprice;
	
	  void telugu() {
		  System.out.println("moviename :" +moviename);
			System.out.println(" relesedyear:" +relesedyear);
			System.out.println(" ticketprice:" +ticketprice);
			
		
	}

	public static void main(String[] args) {
		Movie1 m1 = new Movie1();
		m1.moviename="RRR";
		m1. relesedyear=2022;
		m1. ticketprice=300;
		m1.telugu();

	}

}
