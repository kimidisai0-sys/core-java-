package com.basics;

public class Cricketer {
		
	static int countryid;
    static String countryname;
	
    int jerseynumber;
    String cricketername;
     
    		
	public static void main(String[] args) {
       System.out.println("welcome to indian crecket team");
       
       Cricketer msd = new Cricketer();
         countryid=91;
         countryname="india";
       msd.jerseynumber =7;
       msd.cricketername = "mahindra singh dhoni";
       System.out.println("countryid :" + countryid);
       System.out.println("countryname :" + countryname);
       System.out.println("jurseynumber :" + msd.jerseynumber);
       System.out.println("cricketername :" + msd.cricketername);
       
       Cricketer rohit = new Cricketer();
       rohit.jerseynumber =45;
       rohit.cricketername = "rohit sharma";
       System.out.println("countryid :" + countryid);
       System.out.println("countryname :" + countryname);
       System.out.println("jurseynumber :" + rohit.jerseynumber);
       System.out.println("cricketername :" + rohit.cricketername);
       
       Cricketer virat = new Cricketer();
       virat.jerseynumber =18;
       virat.cricketername = "virat kohli";
       System.out.println("countryid :" + countryid);
       System.out.println("countryname :" + countryname);
       System.out.println("jurseynumber :" + virat.jerseynumber);
       System.out.println("cricketername :" + virat.cricketername);
       
	}
}
