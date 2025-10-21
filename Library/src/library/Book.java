package library;

import java.util.Random;

public class Book {
	private String title, author, bookID;
	private int copiesAvailable;
	
	public Book(String title, String author, int copiesAvailable) {
		this.title = title;
		this.author = author;
		this.copiesAvailable = copiesAvailable;
		this.bookID = bookIdGenerator();
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.copiesAvailable = 50;
		this.bookID = bookIdGenerator();
	}
	
	private String bookIdGenerator() {
		Random r = new Random();
		int id = r.nextInt(99999);
		
		return String.valueOf(id);
	}
	
	public void printBookInformation() {
		System.out.println("======== BOOK INFORMATION ========");
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Copies available: " + this.copiesAvailable);
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getCopiesAvailable() {
		return this.copiesAvailable;
	}
	
	public String getBookId() {
		return this.bookID;
	}
	
	public void borrowBook() {
		this.copiesAvailable -= 1;
	}
	
	public void returnBook() {
		this.copiesAvailable += 1;
	}
	
	public String getTitle() {
		return this.title;
	}
}
