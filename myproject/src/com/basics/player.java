package com.basics;

public class player {
	
	static String country;
	static int countryid;
	
	String name;
	int number;
	
      static void country() {
    	  System.out.println("country name:"+country);
    	  System.out.println("country id:"+countryid);

      }
	void players() {
  	  System.out.println("cricketer name:"+name);
	  System.out.println("cricketer number:"+number);

	}
	
	
	
	public static void main (String[]args) {
		
		player p =  new player();
		player p1 =  new player();
		
		
		country="India";
		countryid=91;
		
		p.name="virat";
		p.number=18;
		p1.name="Msd";
		p1.number=7;
		
		country();
		p.players();
		
		country="industhan";
		countryid=92;
		
		country();
		p1.players();
		
		
		
		p.rohit("rohitsrarma", 45, "india", 91);
}
	void rohit(String name,int number,String country,int c) {
		System.out.println("name:"+name);
		System.out.println("number:"+number);
		System.out.println("country:"+country);
		System.out.println("country:"+country);
	
	}
	
	
}