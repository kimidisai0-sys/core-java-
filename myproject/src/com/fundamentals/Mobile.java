package com.fundamentals;

public class Mobile {

	static String brand;
	String modal;
	int price;
	int ram;

	static {
		brand = "vivo";
		System.out.println("welcome to vivo store");
	}

	static void phone() {
		System.out.println("brand :" + brand);
	}

	void mobilephone() {
		System.out.println("modal :" + modal);
		System.out.println("price :" + price);
		System.out.println("ram :" + ram);

	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();

		m1.modal = "vivoy20";
		m1.price = 15000;
		m1.ram = 4;

		m2.modal = "vivo t4";
		m2.price = 20000;
		m2.ram = 6;

		m3.modal = "vivo t5";
		m3.price = 27000;
		m3.ram = 8;
		phone();
		m1.mobilephone();
		phone();
		m2.mobilephone();
		phone();
		m3.mobilephone();
		System.out.println("Thank you");
	}

}
