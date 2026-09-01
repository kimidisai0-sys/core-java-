package com.fundamentals.methods;

import java.util.Scanner;

public class Bank {

	double balance = 30000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();

		System.out.println("entre balance:");
		b.getBalance();

		System.out.println("entre amount:");
		double deposite = sc.nextDouble();
		b.getdiposite(deposite);
		
		double withdraw =sc.nextDouble();
		b.getwithdraw(withdraw);
	}

	void getBalance() {
		System.out.println("balance:" + balance);
	}

	void getdiposite(double deposite) {
		balance = balance + deposite;
		getBalance();

	}

	void getwithdraw(double withdraw) {
		balance = balance - withdraw;
		getBalance();
	}
}
