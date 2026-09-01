package com.fundamentals.methods;

import java.util.Scanner;


public class Returnwithparameter {
	


	double rectangle(double width, double height) {
		
		return width*height;
	}
	
	int square(int side) {
		
		return side*side;
	}
	
	double triangle(double n,double m) {
		return 0.5*n*m;
	}
	
	double triAngle(double base,double height) {
		
		return 0.5*base*height;
		
	}
	
	double circle(double radius) {
		
		return Math.PI*radius*radius;
		
	}

  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i=25;
		double j=15;
		double area=triAngle(i,j);
		System.out.println("area:"+area);

		double b = sc.nextDouble();
		double h = sc.nextDouble();	
		double result =rectangle(b,h) ;
		System.out.println("rectangle area:"+result);
	

	int a=sc.nextInt();
	int side = square(a);
	System.out.println("square area:"+side);
	
	double n =sc.nextInt();
	double m=sc.nextInt();
	double o=triangle(n,m);
	System.out.println("triangle area:"+o);
	
	double r=sc.nextDouble();
	double radius=circle(r);
	System.out.println("area of circle:"+radius);
}
}