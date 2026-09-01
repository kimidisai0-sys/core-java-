package com.fundamentals.methods;

import java.util.Scanner;

public class Cricketer {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("main method started");

		System.out.println("cricketer name is :");	
		String name = sc.next();
		showname(name);

		System.out.println("cricketer number is :");
		int nu = sc.nextInt();
		shownumber(nu);

		System.out.println("cricketer team is :");
		String team = sc.next();
		showteam(team);

		System.out.println("cricketer titles is :");
		int t = sc.nextInt();	
		showtitle(t);
		
		boolean a=sc.nextBoolean();
		batter(a);
		
		String n=sc.next();
		showplayer(n);

		System.out.println("main method ended");
	}
	
	Scanner sc = new Scanner(System.in);

	void showname(String name) {
		System.out.println("cricketer name:" + name);
	}

	void shownumber(int number) {
		System.out.println("cricketer number:" + number);
	}

	void showteam(String team) {
		System.out.println("cricketer team:" + team);
	}

	void showtitle(int titles) {
		System.out.println("cricketer titles:" + titles);
	}

	void batter(boolean a) {
		if(a) {
	System.out.println("batter");
	}else {
		System.out.println("bowler");
	}
	}
	
	void showplayer(String name) {
		System.out.println("name:"+name);
	}
}
