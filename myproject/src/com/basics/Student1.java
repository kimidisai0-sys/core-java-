package com.basics;

public class Student1 {
    int sid;
    String sname;
    static  int collegeid = 1;
    static String collegename = "vit";
   

       public static void main(String[] args) {
    	   Student1 s = new Student1();
   		s.sid = 100;
   		s.sname = "sai";
   		
   		System.out.println("collegeid : " + collegeid);
   	      System.out.println("collegename : " + collegename);
         System.out.println("sid : " + s.sid);
         System.out.println("sname : " + s.sname);


		
      Student1 sa = new Student1();
      collegeid = 2;
 		collegename = "dnr";
 		
      sa.sid = 12;
      sa.sname = "paparao";
      System.out.println("collegeid : " + collegeid);
      System.out.println("collegename : " + collegename);
      System.out.println("Student1 id : " + sa.sid);
      System.out.println("Student1 name : " + sa.sname);
      
      Student1 y = new Student1();
      y.sid = 13;
      System.out.println("collegeid : " + collegeid);
      System.out.println("collegename : " + collegename);
      System.out.println("Student1 id : " + y.sid);
      System.out.println("Student1 name : " + y.sname);
	}

}
