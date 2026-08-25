package com.fundamentals;

public class Librarybook {

	int bookid;
	String booktitle;
	String authorname;
	int avalablecopies;
	static String libraryname = "central library";
	static String librarianname = "yesu";

	void bookdetails() {
		System.out.println("bookid =" + bookid);
		System.out.println("booktitle =" + booktitle);
		System.out.println("authorname =" + authorname);
		System.out.println("avalablecopies =" + avalablecopies);
	}

	static void librarydetails() {
		System.out.println("libraryname =" + libraryname);
		System.out.println("librarianname =" + librarianname);
	}

	void bookissu() {
		if (avalablecopies > 0) {
			avalablecopies--;
			System.out.println(booktitle + " issued successfully.");
		} else {
			System.out.println(booktitle + " is not available.");
		}

	}

	static void changelibrarianname(String newlibrarianname) {
		librarianname = newlibrarianname;
	}

	public static void main(String[] args) {

		Librarybook l1 = new Librarybook();
		Librarybook l2 = new Librarybook();

		l1.bookid = 101;
		l1.booktitle = "animal";
		l1.authorname = "murali";
		l1.avalablecopies = 6;
		
		l2.bookid = 121;
		l2.booktitle = "java";
		l2.authorname = "guyfcu";
		l2.avalablecopies = 9;
		
		System.out.println("*********book 1 details**********");	
		librarydetails();
		l1.bookdetails();
		l1.bookissu();
		
		System.out.println("********* book 2 details**********");
		librarydetails();
		l2.bookdetails();
		l2.bookissu();
		
		System.out.println("********* After change librarianname*************");
		changelibrarianname("paparao");
		librarydetails();
		
		System.out.println("\n===== UPDATED BOOK DETAILS =====");
		
        System.out.println("\nBook 1:");
        l1.bookdetails();

        System.out.println("\nBook 2:");
        l2.bookdetails();


	}

}
