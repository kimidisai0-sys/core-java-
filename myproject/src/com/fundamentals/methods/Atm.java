package com.fundamentals.methods;

import java.util.Scanner;

public class Atm {
	
	  static String bankname="SBI";
	  
	  long accountnumber;
	  double balance;
	  
	  static void bank() {
		  System.out.println("user bank name:"+bankname);
	  }
	  
	  void userdetails() {
		  System.out.println("user accountnumber:"+accountnumber);
		  System.out.println("user balance:"+balance);

	  }
	  
	 
	  Scanner sc = new Scanner(System.in);
	  double diposite() {	 
		double  diposite =sc.nextInt();
		balance=balance+diposite;
		return  balance;
	  }
	  
	  double widthdraw() {
		  double widthdraw=sc.nextDouble();
		 if (balance>=widthdraw) {
		 balance=balance-widthdraw;
		 System.out.println("widthdraw amount:"+balance);
		  }else {
			  System.out.println("insufficient founds");
		  }
		  return balance;
	  }
	  
	  double checkbalance() {
		  return balance; 
	  }
	  
	  

	public static void main(String[] args) {
		
		Atm a= new Atm();
		Atm b = new Atm();
		
		a.accountnumber=2323244;
		a.balance=10000;
		
		b.accountnumber=455445463;
		b.balance=20000;
		
		bank();
		a.userdetails();
		System.out.println("enter diposite amount");
		double d=a.diposite();
		System.out.println("balance:"+d);
		
		System.out.println("enter widthdraw amount");
		double w=a.widthdraw();
		System.out.println("balance:"+w);
		double x=a.checkbalance();
		System.out.println("avalable balance:"+x);
		
		
System.out.println("********************************");
		
		bank();
		b.userdetails();
		System.out.println("enter diposite amount");
		double e=b.diposite();
		System.out.println("balance:"+e);
		
		System.out.println("enter widthdraw amount");
		double f=b.widthdraw();
		System.out.println("balance:"+f);
		
		double y=b.checkbalance();
		System.out.println("avalable balance:"+y);

	}

}
