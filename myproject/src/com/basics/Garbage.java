package com.basics;

public class Garbage {
	
	 Garbage() {
		System.out.println("object created");
	}
@Override
protected void finalize() throws Throwable {
	System.out.println("garbage collector");
	
}
	public static void main(String[] args) {
		Garbage t1 = new Garbage();
		Garbage t2 = new Garbage();
		Garbage t3 = new Garbage();
		Garbage t4 = new Garbage();
		
		
       t1=null;
       System.gc();
       
   	System.out.println("main method ended");

	}

}
