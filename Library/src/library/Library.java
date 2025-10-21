package library;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> booksAvailable;
	
	public Library(ArrayList<Book> books) {
		this.booksAvailable = books;
	}
	
	public void showAvailableBooks() {
		System.out.println("\n============== BOOKS AVAILABLE ==============");
		for(Book book : booksAvailable) {
			System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t" + book.getCopiesAvailable());
		}
	}
	
	public void borrowBook(String title) {
		boolean found = false;
		
		for(Book book: booksAvailable) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				book.borrowBook();
				System.out.println("\nBook Found!");
				found = true;
				break;
			} 
		}
		
		if(!found) {
			System.out.println("\nBook not found");
		}
		
	}
	
	public void returnBook(String title) {
		boolean found = false;
		
		for(Book book: booksAvailable) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				book.returnBook();
				System.out.println("\nBook returned!");
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("\nBook not from here.");
		}
	}
}
