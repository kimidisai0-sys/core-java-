package com.fundamentals.methods;

import java.util.Scanner;

public class Loanmanagement {

	String customerName;
	double loanAmount;
	double interestRate;
	int loanTenure;

	double calculateinterest(double loanAmount, double interestRate) {
		double interest = loanAmount * interestRate * loanTenure / 100;
		return interest;
	}

	double totalamount(double interest) {
		double totalamount = loanAmount + interest;
		return totalamount;
	}

	double calculatemonthleyEmi(double totalamount, int loanTenure) {
		double monthlyEmi = totalamount / (loanTenure * 12);
		return monthlyEmi;
	}

	void displayloansummery(double interest, double totalAmount, double emi) {
		System.out.println("\n=================================");
		System.out.println("        LOAN SUMMARY");
		System.out.println("=================================");
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Loan Amount     : " + loanAmount);
		System.out.println("Interest Rate   : " + interestRate + "%");
		System.out.println("Loan Tenure     : " + loanTenure + " years");
		System.out.println("Interest        : " + interest);
		System.out.println("Total Amount    : " + totalAmount);
		System.out.println("Monthly EMI     : " + emi);
		System.out.println("=================================");
	}

	 void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Loanmanagement l = new Loanmanagement();
		Loanmanagement l1 = new Loanmanagement();

		System.out.println("Enter customername");
		l.customerName = sc.next();

		System.out.println("Enter loanAmount");
		l.loanAmount = sc.nextDouble();

		System.out.println("Enter interestRate ");
		l.interestRate = sc.nextDouble();
		
		System.out.println("Enter  loanTenure");
		l.loanTenure=sc.nextInt();
		
		
		double interest =l.calculateinterest(l.loanAmount, l.interestRate);
		
		
		double totalAmount=l.totalamount(interest);
		
		double emi = l.calculatemonthleyEmi(totalAmount,l. loanTenure);
		
		
		 l.displayloansummery(interest,  totalAmount,  emi);
		 

			System.out.println("Enter customername");
			l1.customerName = sc.next();

			System.out.println("Enter loanAmount");
			l1.loanAmount = sc.nextDouble();

			System.out.println("Enter interestRate ");
			l1.interestRate = sc.nextDouble();
			
			System.out.println("Enter  loanTenure");
			l1.loanTenure=sc.nextInt();
			
			
			double interest1 =l1.calculateinterest(l1.loanAmount, l1.interestRate);
			
			
			double totalAmount1=l1.totalamount(interest);
			
			double emi1 = l1.calculatemonthleyEmi(totalAmount,l1. loanTenure);
			
			
			 l1.displayloansummery(interest,  totalAmount,  emi);
			 
	}

}
