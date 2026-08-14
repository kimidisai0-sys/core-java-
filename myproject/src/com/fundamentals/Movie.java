package com.fundamentals;

public class Movie {

	String moviename;
	int relesedyear;
	int ticketprice;
	
	public static void main(String[] args) {
		System.out.println("***movie1***");
		Movie m1 = new Movie();
		m1.moviename="RRR";
		m1. relesedyear=2022;
		m1. ticketprice=300;
		System.out.println("moviename :" +m1.moviename);
		System.out.println(" relesedyear:" +m1.relesedyear);
		System.out.println(" ticketprice:" +m1.ticketprice);
		
		System.out.println("***movie2***");
		Movie m2 = new Movie();
		m2.moviename="peddi";
		m2.relesedyear=2026;
		m2.ticketprice=250;
		System.out.println("moviename :" +m2.moviename);
		System.out.println(" relesedyear:" +m2.relesedyear);
		System.out.println(" ticketprice:" +m2.ticketprice);
		
		System.out.println("***movie3***");
		Movie m3 = new Movie();
		m3.moviename="bahubali2";
		m3. relesedyear=2017;
		m3. ticketprice=200;
		System.out.println("moviename :" +m3.moviename);
		System.out.println(" relesedyear:" +m3.relesedyear);
		System.out.println(" ticketprice:" +m3.ticketprice);

	}

}
