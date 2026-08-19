package com.fundamentals;

public class Bank {

	String customerName;
	int accountNumber;
	double accountBalance;
	String accountStatus;
	
	static int accountnumber=100;

	Bank(String name, double balance, String status) {
        customerName = name;
        accountBalance = balance;
        accountStatus = status; 
		accountNumber = generateAccountNumber();
	}

	static int generateAccountNumber() {
		accountnumber++;
		return accountnumber;
	}

	void display() {
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println("Account Status : " + accountStatus);
		System.out.println("-----------------------------------" );

	}

	public static void main(String[] args) {
		Bank b1 = new Bank("paparao",328432853,"active");
		Bank b2 = new Bank("yesu",859353486,"active");
		Bank b3 = new Bank("murali",743265,"inactive");

		b1.display();		
		b2.display();
		b3.display();
	}

}
