package com.fundamentals;

public class Library {

	int bookid;
	String booktitle;
	String authorname;
	int availablecopies;
	String libraryname;
	String librarienname;
	
	void displaybookdetails() {
		System.out.println("bookid :" + bookid);
		System.out.println("booktitle :" + booktitle);
		System.out.println("authorname :" + authorname);
		System.out.println("availablecopies :" + availablecopies);
}
	
	void displaylibrarydetails() {
		System.out.println(" libraryname:" +libraryname );
		System.out.println(" librarienname:" +librarienname );
	}
	
	void changelibrarienname(String newlibrarienname) {
		librarienname = newlibrarienname;
	}
	
	public static void main(String[] args) {
		Library l1 = new Library();
		Library l2 = new Library();
		
		System.out.println("main method started");
		l1.bookid=1;
		l1.booktitle="maths";
		l1.authorname="paparao";
		l1.availablecopies=20;
		l1. libraryname="central library";
		l1. librarienname="yesu";
		System.out.println("*******BLOCK1 DETAILS");

		l1.displaylibrarydetails();
		System.out.println("*******BLOCK2 DETAILS");
		l1.displaybookdetails();
		
		l2.bookid=2;
		l2.booktitle="java";
		l2.authorname="ravi";
		l2.availablecopies=240;
		l2. libraryname="dnr";
		l2. librarienname="raju";
		System.out.println("*******BLOCK1 DETAILS");

		l2.displaylibrarydetails();
		System.out.println("*******BLOCK2 DETAILS");

		l2.displaybookdetails();
		l1.changelibrarienname("Suresh");

        System.out.println("\n----- After Changing Librarian -----");
        l1.displaylibrarydetails();

		
		
	}

}
