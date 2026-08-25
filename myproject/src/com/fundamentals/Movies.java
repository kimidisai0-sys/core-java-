package com.fundamentals;

public class Movies {

	int movieid;
	String moviename;
	String heroname;
	int availableseats;

	static String threatername = "AVG";
	static String managername = "tom";

	void moviedetails() {
		System.out.println("movieid:" + movieid);
		System.out.println("moviename:" + moviename);
		System.out.println("heroname:" + heroname);
		System.out.println("availableseats:" + availableseats);
	}

	static void threater() {
		System.out.println("threatername:" + threatername);
		System.out.println("managername:" + managername);
	}

	void bookseats() {
		if (availableseats > 0) {
			availableseats--;
			System.out.println("availableseats:" + "ticket is booked");
		} else {	
		System.out.println("seats are not available");
	}
	}
	
	void changemanager(String newmanager) {
		managername=newmanager;
	}
	public static void main(String[] args) {
		
		Movies m1 = new Movies();
		Movies m2 = new Movies();

		m1.movieid=101;
		m1. moviename="DC";
		m1. heroname="Lokesh";
		m1. availableseats=8;
		
		m2.movieid=102;
		m2. moviename="KGF";
		m2. heroname="Yesh";
		m2. availableseats=5;
		
		System.out.println("********first movie********" );
		threater();
		m1.moviedetails();
		
		System.out.println("********second movie********" );
		threater();
		m2.moviedetails();
		
		m1.changemanager("john");
		threater();
		
		m1.bookseats();
		m1.moviedetails();

		m2.bookseats();
		m2.moviedetails();

	}

}
