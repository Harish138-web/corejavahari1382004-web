package com.example.LibraryManagement;

public class BookService {
	 private BookRepository bookRepository;

	    // Setter for Dependency Injection
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void listBooks() {
	        System.out.println("BookService: Calling repository...");
	        bookRepository.displayBooks();
	    }

}
