package com.fundamentals.methods;

public class Method2 {

	int balance = 100;
	int a=10;
	int b;

	public static void main(String[] args) {

		
		
		Method2 m = new Method2();

		System.out.println("main method started");
		m.showbalance(20000,30000,10000);
		m.name("sai");
		m.getStudentid(101);
		m.getStudent("DNR");
		m.getPh(8374092356l);
		m.couster2(46735,444,"papi");
		m.coustomer();
		m.bank("sbi","undi");
		m.customer1();
		system(23656564);
		m.fgdsgeu();
		System.out.println("************************************");
		m.paparao("paparao",101,8765432911l,'f',"DNR","akividu");
		m.multiplication(4, 5);
	}

	void name(String name) {
		System.out.println("name is:" + name);
	}

	void getStudentid(int id) {
		System.out.println("id is:" + id);
	}

	void getStudent(String college) {
		System.out.println("college name:" + college);
	}

	void getPh(long ph) {
		System.out.println("phone no:" + ph);
	}

	void coustomer() {
		balance++;
		System.out.println(balance);
	}

	void customer1() {
		balance--;
		System.out.println(balance);
		balance = balance + 1000;
		System.out.println(balance);
		balance = balance * 2;
		System.out.println(balance);
	}

	void couster2(int b,int c ,String name) {
		System.out.println(b+c);
		System.out.println(c);
		System.out.println(name);

	}

	void bank(String name, String branch) {
		System.out.println(name);
		System.out.println(branch);

	}
	void paparao(String name,int id,long ph,char gender ,String college,String city) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(ph);
		System.out.println(gender);
		System.out.println(college);
		System.out.println(city);

	}
	static void system(double balance) {
		System.out.println("balance:"+balance);
	}
	void fgdsgeu() {
		System.out.println(a);
		
		b=a+19;
		System.out.println(b);
	}
		void showbalance(double balance,double deposite,double withdraw ) {
			System.out.println("show balance:"+balance);
			balance=balance+deposite;
			System.out.println("show balance:"+balance);
			balance=balance-withdraw;
			System.out.println("show balance:"+balance);		

	}
		
		void multiplication(int c,int d) {
			System.out.println("result:"+c*d);
		}
}

