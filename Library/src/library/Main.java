package library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Book1", "Author1");
		Book book2 = new Book("Book2", "Author2", 35);
		Book book3 = new Book("Thaye", "Author3", 80);
		Book book4 = new Book("Book4", "Author4");
		Book book5 = new Book("Book5", "Author5");
		
		ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5));
		
		Library lib = new Library(bookList);
		lib.showAvailableBooks();
		lib.borrowBook("Thaye");
		lib.borrowBook("Thaye");
		lib.borrowBook("Thaye");
		lib.borrowBook("Thaye");
		lib.borrowBook("Thaye");
		lib.borrowBook("Thaye");
		book3.printBookInformation();
	}

}
